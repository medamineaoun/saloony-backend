import {Notification}  from "../models/notification.model"
import axios from 'axios';
import { mailer } from '../config/mailer.js';


export const createNotification = async (req, res) => {
  try {
    const notif= new Notification({...req.body});
    await notif.save();
    res.status(201).json(notif);
  } catch (err) {
    res.status(400).json({ error: err.message });
  }
};

export const getUserNotifications = async (req, res) => {
  try {
    const { userId } = req.params;
    const notifications = await Notification.find({ recipientId: userId });
    res.status(200).json(notifications);
  } catch (err) {
    res.status(400).json({ error: err.message });
  }
};

export const markAsRead = async (req, res) => {
  try {
    const { id } = req.params;
    await Notification.findByIdAndUpdate(id, { isRead: true });
    res.status(200).json({ message: "Notification marked as read" });
  } catch (err) {
    res.status(400).json({ error: err.message });
  }
};

export const createNotification2 = async (req, res) => {
  try {
    const { recipientId, type, message } = req.body;

    // Appel au microservice user-service via Eureka
    const response  = await axios.get(`http://api/user/retrieve-user/${recipientId}`);
    const user = response.data;
    // docker compose service
    // const { data: user } = await axios.get(`${process.env.USER_SERVICE_URL}api/user/retrieve-user/${recipientId}`);


    if (!user || !user.email) {
      return res.status(404).json({ error: 'Utilisateur introuvable ou email manquant' });
    }

    // Créer la notification en DB
    const notif = await Notification.create({ recipientId, type, message });

    // Envoyer le mail
    await mailer.sendMail({
      from: `"Salon de coiffure" <${process.env.MAIL_USER}>`,
      to: user.email,
      subject: type === 'reservation' ? 'Nouvelle réservation' : 'Confirmation de rendez-vous',
      text: message
    });

    res.status(201).json({ success: true, notif });
  } catch (err) {
    console.error('Erreur notification :', err.message);
    res.status(500).json({ error: err.message });
  }
};
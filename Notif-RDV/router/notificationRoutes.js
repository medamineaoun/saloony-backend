import express from 'express';
import Notification from '../models/notification.model.js';
import { mailer } from '../config/mailer.js';
import axios, { Axios } from 'axios';
import axiosClient from '../config/axiosClient.js';
const router = express.Router();

//**************************************** *//

// create => POST ()
// 0Route Add Contact
// 0 Method POST
// àdata : req.body
// pATH : HTTP:/localhost:5000/api/contact
router.post("/post",async (req,res)=>{
try {
    const { recipientId, type, message } = req.body;

    // Appel au microservice user-service via Eureka
    const { data: user } = await axiosClient.get(`http://localhost:8080/api/provider/retrieve-provider-by-name/${recipientId}`);


    if (!user || !user.userEmail) {
      return res.status(404).json({ error: 'Utilisateur introuvable ou email manquant' });
    }

    // Créer la notification en DB
    const notif = await Notification.create({ recipientId, type, message });

    // Envoyer le mail
    await mailer.sendMail({
      from: `"Salon de coiffure" <${process.env.MAIL_USER}>`,
      to: user.userEmail,
      subject: type === 'reservation' ? 'Nouvelle réservation' : 'Confirmation de rendez-vous',
      text: message
    });

    res.status(201).json({ success: true, notif });
  } catch (err) {
    res.status(400).json({ error: err.message });
  }
})
router.get("/:userId", async (req, res) => {
  try {
    const { userId } = req.params;
    const notifications = await Notification.find({ recipientId: userId });
    res.status(200).json(notifications);
  } catch (err) {
    res.status(400).json({ error: err.message });
  }
})

router.put("/:id/read",async (req, res) => {
  try {
    const { id } = req.params;
    await Notification.findByIdAndUpdate(id, { isRead: true });
    const client = await Notification.findById(id);
    res.status(200).json({ message: "Notification marked as read" ,client_Name : client.recipientId});
  } catch (err) {
    res.status(400).json({ error: err.message });
  }
})






export default router;

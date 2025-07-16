import nodemailer from 'nodemailer';
import dotenv from 'dotenv';
dotenv.config();

export const mailer = nodemailer.createTransport({
  service: 'gmail',
  auth: {
    user: process.env.MAIL_USER,      // ex: notifsalon@gmail.com
    pass: process.env.MAIL_PASS       // mot de passe ou "App Password"
  }
});

import express from 'express';
import Notification from '../models/notification.model.js';

const router = express.Router();

//**************************************** *//

// create => POST ()
// 0Route Add Contact
// 0 Method POST
// àdata : req.body
// pATH : HTTP:/localhost:5000/api/contact
router.post("/post",async (req,res)=>{
  try {
    const notif = await Notification.create(req.body);
    res.status(201).json(notif);
    //send success
    res.send({msg:"add route", notif});
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

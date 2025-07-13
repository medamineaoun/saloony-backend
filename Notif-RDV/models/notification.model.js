import mongoose from "mongoose";
const {Schema} = mongoose ;
//model or we call it the contact schema ==structure
const notificationSchema  = new Schema({
    recipientId: {
       type: String, required: true 
      },
    type: {
       type: String, 
       enum: ["reservation", "confirmation", "refus"], required: true 
      },
    message: {
       type: String, 
       required: true 
      },
    isRead: {
       type: Boolean, 
       default: false 
      },
    timestamp: { 
      type: Date, 
      default: Date.now 
    }
    });
export default mongoose.model('Notification', notificationSchema);

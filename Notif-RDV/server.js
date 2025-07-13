import express from 'express';
import 'dotenv/config';
import connectDB from './config/connectDB.js';
import cors from 'cors'
import router from './router/notificationRoutes.js';



const app =express()

//creat a server PORT
const PORT =process.env.PORT;
//*********************************************************

app.use(cors());

//call function that connect with the database
connectDB();

//middleware to read the json type
app.use(express.json());

// middleware for contact API
app.use("/notifications",router);


// create server 
app.listen(PORT,(err)=>err?console.log(err):console.log(`serve is runnig in port ${PORT}`))
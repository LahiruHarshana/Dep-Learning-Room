import express from 'express';
import {customerController} from "./customer-controller.js";
import {ItemController} from "./item-controller.js";






const app = express();

app.listen(7070,()=>{
    console.log("Server is listening at 7070");
});

app.use('/customers',customerController);
app.use('/items',ItemController);
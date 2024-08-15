import express from 'express'
import {advertismentController} from "./controller/advertisement.http.controller.js";
import {userController} from "./controller/user.http.controller.js";
import {ping as pingToDatabase} from "./database/pool.db.js";

const app = express();

app.use('/advertisements',advertismentController);
app.use('/user',userController);

app.listen(5051,async () => {
    console.log("Server is listening at 5051");
    await pingToDatabase();
    console.log("Connect to the database server - OK")
    console.log("Server is listening at 5051")
});


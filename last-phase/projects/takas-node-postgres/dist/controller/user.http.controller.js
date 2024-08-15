import express, { json } from "express";
import { pool } from "../database/pool.db.js";
export const userController = express.Router();
userController.use(json());
userController.get('/me', getUserAccount);
userController.post('/', postUserAccount);
userController.delete('/me', deleteUserAccount);
function getUserAccount(req, res) {
}
async function postUserAccount(req, res) {
    const user = req.body;
    if (!user.email || !user.name || !user.contact) {
        return res.status(400).type('html').send('<h1>Missing required fields</h1>');
    }
    if (!validateEmail(user.email)) {
        return res.status(400).type('html').send('<h1>Invalid email format</h1>');
    }
    if (!validateContact(user.contact)) {
        return res.status(400).type('html').send('<h1>Invalid contact number format</h1>');
    }
    // Business Validation
    const connection = await pool.connect();
    try {
        const emailResult = await connection.query('SELECT 1 FROM "user" WHERE email = $1', [user.email]);
        if (emailResult.rowCount && emailResult.rowCount > 0) {
            return res.status(409).type('html').send('<h1>Email already in use</h1>');
        }
        const contactResult = await connection.query('SELECT 1 FROM "user" WHERE contact = $1', [user.contact]);
        if (contactResult.rowCount && contactResult.rowCount > 0) {
            return res.status(409).type('html').send('<h1>Contact number already in use</h1>');
        }
        await connection.query('INSERT INTO "user" (email, name, contact) VALUES ($1, $2, $3)', [user.email, user.name, user.contact]);
        res.sendStatus(201);
    }
    catch (e) {
        console.error(e);
        res.sendStatus(500);
    }
    finally {
        connection.release();
    }
}
function deleteUserAccount(req, res) {
    console.log("Delete User");
}
function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(email);
}
function validateContact(contact) {
    const re = /^[0-9]{10}$/;
    return re.test(contact);
}
//# sourceMappingURL=user.http.controller.js.map
import express, { json } from 'express';
import { pool } from "../database/pool.db.js";
import { UserTo } from "../to/user.to.js";
import { validate } from "class-validator";
import { ErrorTo } from "../to/error.to.js";
export const controller = express.Router();
controller.use(json());
controller.get("/me", getUserAccount);
controller.post("/", validateUser, createNewUserAccount);
controller.delete("/me", deleteUserAccount);
function validateEmail(email) {
    const regExp = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return regExp.test(email);
}
async function validateUser(req, res, next) {
    const user = new UserTo();
    Object.assign(user, req.body);
    const errors = await validate(user);
    if (errors.length > 0) {
        res.status(400)
            .json(new ErrorTo(400, "Bad Request", "Data Validation Failed", req.baseUrl + req.url, errors));
    }
    else {
        next();
    }
}
async function createNewUserAccount(req, res) {
    const user = req.body;
    const connection = await pool.connect();
    // Business Validation
    // 1. Find whether this email already exists
    // 2. Find whether this contact number is already associated with another user
    try {
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
    console.log("Delete user account");
}
function getUserAccount(req, res) {
    console.log("Get user account information");
}
//# sourceMappingURL=user.http.controller.js.map
import mysql from 'mysql2/promise';
import 'dotenv/config'
import {faker} from "@faker-js/faker";

const connection = mysql.createConnection({
    user :'root',
    password:'12345678',
    database:'dep12-node',
    host : 'localhost',
    port:3306
});


const stm = await connection.prepare("INSERT INTO student (name,contact) VALUES ()")
connection.end();


import { Client } from "pg";
import { faker } from "@faker-js/faker";
console.log("Hello");
const client = new Client({
    user: 'postgres',
    password: 'psql',
    host: 'localhost',
    port: 12500,
    database: 'dep-12'
});
await client.connect();
// try {
//     const result = client.query("INSERT INTO customer (id,namd,address) VALUES ($1,$2,$3)",
//         ['C001','Kasun','Galle']);
//     console.log(result.rowCount)
// }catch (e){
//     console.log(e)
// }
const result = client.query("SELECT * FROM customer WHERE id=$1", ['C001']);
await client.end();
//
// for (let i = 0; i <100; i++) {
//     client.query("INSERT INTO customer(id,name,address) VALUES ($1,$2,$3)",
//         [generatedCustomerId(i),'Kasun','Galle']);
// }
//
//
//
// function generatedCustomerId(index:number){
//     index++;
//     if (index < 10) return "C00" + index;
//     if (index < 100) return "C0" + index;
//     return "C" + index;
// }
for (let i = 0; i < 100; i++) {
    client.query("INSERT INTO customer(id,name,address) VALUES ($1,$2,$3)", [generatedCustomerId(i), faker, 'Galle']);
}
function generatedCustomerId(index) {
    index++;
    if (index < 10)
        return "C00" + index;
    if (index < 100)
        return "C0" + index;
    return "C" + index;
}
//# sourceMappingURL=main.js.map
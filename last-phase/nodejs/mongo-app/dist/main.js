import { MongoClient } from "mongodb";
const client = new MongoClient("mongodb://localhost:14500");
await client.connect();
const db = client.db('dep12-node');
const employeeCollection = db.collection('Employee');
// DELETE FROM employee WHERE address = 'Galle'
// await employeeCollection.deleteMany({address: 'Galle'})
// DELETE FROM employee WHERE true;
// await employeeCollection.deleteMany({});
//
// const employees : Array<Employee> = [];
//
// for (let i = 0; i <100; i++) {
//     employees.push({
//         id : generateEmployeeId(i),
//         name : faker.person.fullName(),
//         contact : faker.helpers.fromRegExp(/0[1-9]{2}-[0-9]{7}/)
//     });
// }
//
// const result = await employeeCollection.insertMany(employees);
// console.log(result);
const docs = employeeCollection.find({});
// while (await docs.hasNext()){
//     const doc = await docs.hasNext();
//     console.log(doc);
// }
for await (const doc of docs) {
    console.log(doc);
}
await client.close();
function generateEmployeeId(i) {
    if (i++ < 10)
        return "E00" + i;
    else if (i < 100)
        return "E0" + i;
    else
        return "E" + i;
}
//# sourceMappingURL=main.js.map
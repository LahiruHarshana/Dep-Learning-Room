import express from "express";
export const customerController = express.Router();
customerController.get('/', (req, res) => {
    res.end("<h1>Customer doGet()</h1>");
});
customerController.post('/', (req, res) => {
    res.end("<h1>Customer doPost()</h1>");
});
customerController.put('/', (req, res) => {
    res.end("<h1>Customer doPut()</h1>");
});
customerController.patch('/', (req, res) => {
    res.end("<h1>Customer doPatch()</h1>");
});
customerController.delete('/', (req, res) => {
    res.end("<h1>Customer doDelete()</h1>");
});
//# sourceMappingURL=customer-controller.js.map
import express from "express";
export const ItemController = express.Router();
ItemController.get('/', (req, res) => {
    res.end("<h1>Item doGet()</h1>");
});
ItemController.post('/', (req, res) => {
    res.end("<h1>Item doPost()</h1>");
});
ItemController.put('/', (req, res) => {
    res.end("<h1>Item doPut()</h1>");
});
ItemController.patch('/', (req, res) => {
    res.end("<h1>Item doPatch()</h1>");
});
ItemController.delete('/', (req, res) => {
    res.end("<h1>Item doDelete()</h1>");
});
//# sourceMappingURL=item-controller.js.map
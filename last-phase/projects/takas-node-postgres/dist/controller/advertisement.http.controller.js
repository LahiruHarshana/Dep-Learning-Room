import express from "express";
export const controller = express.Router();
controller.get('/', getAllAdvertisement);
controller.post('/', postAdvertisement);
controller.delete('/:id', deleteAdvertisement);
function getAllAdvertisement(req, res) {
    console.log("Get all advertismenets");
}
function postAdvertisement(req, res) {
    console.log("Post advertismenets");
}
function deleteAdvertisement(req, res) {
    console.log("Delete advertismenets");
}
//# sourceMappingURL=advertisement.http.controller.js.map
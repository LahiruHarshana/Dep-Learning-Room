import express from 'express';
export const controller = express.Router();
controller.get('/', getAllAdvertisements);
controller.post('/', postAdvertisement);
controller.delete('/:id', deleteAdvertisement);
function getAllAdvertisements(req, res) {
    console.log("Get all advertisements");
}
function postAdvertisement(req, res) {
    console.log("Post advertisement");
}
function deleteAdvertisement(req, res) {
    console.log("Delete advertisement");
}
//# sourceMappingURL=advertisement.http.controller.js.map
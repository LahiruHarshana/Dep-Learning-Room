import express,{Request,Response} from "express";

export const advertismentController = express.Router();

advertismentController.get('/',getAllAdvertisement);
advertismentController.post('/',postAdvertisement);
advertismentController.delete('/:id',deleteAdvertisement);


function getAllAdvertisement(req: Request,res : Response) {
    console.log("Get all advertismenets");
}

function postAdvertisement(req: Request,res : Response) {
    console.log("Post advertismenets")
}

function deleteAdvertisement(req: Request,res : Response) {
    console.log("Delete advertismenets")
}



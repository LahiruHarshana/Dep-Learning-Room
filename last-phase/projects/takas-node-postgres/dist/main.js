import express from 'express';
import { controller as AdvertismentController } from "./controller/advertisement.http.controller";
const app = express();
app.use('/advertisements', AdvertismentController);
app.listen(5051, () => {
    console.log("Server is listening at 5051");
});
//# sourceMappingURL=main.js.map
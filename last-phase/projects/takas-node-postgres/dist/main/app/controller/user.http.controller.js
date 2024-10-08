var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
import express, { json } from 'express';
import { Validators } from "../middleware/validators.middleware.js";
import { DeleteMapping, GetMapping, Middleware, PostMapping, RestController } from "../config/core.config.js";
let UserHttpController = class UserHttpController {
    async createNewUserAccount(req, res) {
        const user = req.body;
    }
    async deleteUserAccount(req, res) {
        console.log("Delete user account");
    }
    async getUserAccount(req, res) {
        console.log("Get user account information");
    }
};
__decorate([
    Middleware([Validators.validateUser]),
    PostMapping("/")
], UserHttpController.prototype, "createNewUserAccount", null);
__decorate([
    DeleteMapping("/me")
], UserHttpController.prototype, "deleteUserAccount", null);
__decorate([
    GetMapping("/me")
], UserHttpController.prototype, "getUserAccount", null);
UserHttpController = __decorate([
    Middleware([json()]),
    RestController("/users")
], UserHttpController);
export { UserHttpController };
const router = express.Router();
const httpController = new UserHttpController();
router.use(json());
router.get("/me", httpController.getUserAccount);
router.post("/", Validators.validateUser, httpController.createNewUserAccount);
router.delete("/me", httpController.deleteUserAccount);
//# sourceMappingURL=user.http.controller.js.map
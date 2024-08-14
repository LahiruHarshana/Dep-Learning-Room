import express from 'express';
const app = express();
//Setup middlewares
app.use('/', middleware1);
app.use('/', middleware2);
//Logical Mapping
app.get("/", handleRequestFn1);
app.post("/", handleRequestFn2);
app.listen(7070, () => {
    console.log("Server is listening at 7070");
});
function handleRequestFn1(req, res) {
    console.log("Incoming Request");
    res.write("<h1>Hello Express.js</h1>");
    res.end();
}
function handleRequestFn2(req, res) {
    console.log("Incoming Request");
    res.write("<h1>Hello Express.js</h1>");
    res.end();
}
function middleware1(req, res, next) {
    console.log("Middleware2");
}
function middleware2(req, res, next) {
    console.log("Middleware2");
}
//# sourceMappingURL=main.js.map
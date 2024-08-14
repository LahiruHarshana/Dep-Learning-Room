import * as http from "http";
const httpServer = http.createServer();
httpServer.on('request', (req, res) => {
    switch (req.url) {
        case "/customers":
            switch (req.method) {
                case 'GET':
                    Customer.doGet(req, res);
                    break;
                case 'POST':
                    Customer.doPost(req, res);
                    break;
                case 'PUT':
                    Customer.doPut(req, res);
                    break;
            }
            res.end("<h1>Hello Customer</h1>");
            break;
        case "/items":
            res.end("<h1>Hello Items</h1>");
            break;
        default:
            res.statusCode = 404;
            res.end("<h1>404 NOT FOUND</h1>");
    }
});
httpServer.listen(7070, () => {
    console.log("Server is listening on port 7070");
});
class Customer {
    static doGet(req, res) {
        res.end("<h1>Customers: Get()</h1>");
    }
    static doPost(req, res) {
        res.end("<h1>Customers: Post()</h1>");
    }
    static doPut(req, res) {
        res.end("<h1>Customers: Put()</h1>");
    }
}
//# sourceMappingURL=main.js.map
import 'dotenv/config';
console.log("Hello");
const e = process.env;
console.log(e.HOME);
console.log(e.SHELL);
console.log(e['PWD']);
e['IJSE'] = 'DEP-12';
console.log("---------------");
console.log(e['DB_HOST']);
console.log(e['DB_USER']);
console.log(e['DB_PASSWORD']);
console.log(e['DB_PORT']);
//# sourceMappingURL=main.js.map
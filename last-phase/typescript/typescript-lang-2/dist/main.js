"use strict";
console.log("Hello Typescript language 2");
console.log("Hello Typescript language 2");
class Customer {
    id = '';
    name = '';
    address = '';
}
class Student {
    id;
    name;
    contact;
    constructor(id, name, contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
}
var s001 = new Student("S001", "Tharindu", "073243423");
console.log(s001.id, s001.name, s001.contact);

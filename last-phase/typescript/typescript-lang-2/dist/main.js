"use strict";
console.log("Hello Typescript language 2");
console.log("Hello Typescript language 2");
class Customer {
    id = '';
    name = '';
    address = '';
}
class Student {
    #id;
    name;
    contact;
    constructor(id, name, contact) {
        this.#id = id;
        this.name = name;
        this.contact = contact;
    }
}
var s001 = new Student("S001", "Tharindu", "073243423");
// console.log(s001.id,s001.name,s001.contact);
class Employee {
    id;
    name;
    address;
    contact;
    // id : string;
    // name : string;
    // address : string;
    // contact: string;
    constructor(id, name, address, contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        // this.id = id;
        // this.name = name;
        // this.address = address;
        // this.contact = contact;
    }
}
var employee = new Employee("E001", "Kasun Sampath", "Galle", "07178234");
console.log(employee);
console.log(employee.id, employee.name, employee.address, employee.contact);
class Teacher {
    id = '';
    name = '';
}

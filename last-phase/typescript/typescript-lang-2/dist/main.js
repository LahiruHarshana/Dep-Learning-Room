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
    id;
    name;
    institute = 'Ijse'; // instance
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    print() {
        const x = 10; // local
    }
}
var t001 = new Teacher("T001", "Imantha");
console.log(t001.id, t001.name, t001.institute);
class MyAcstractClass {
}
class MyConcreteClass extends MyAcstractClass {
    myMethod() {
    }
}
var MyEnum1;
(function (MyEnum1) {
    MyEnum1[MyEnum1["CONST1"] = 0] = "CONST1";
    MyEnum1[MyEnum1["CONST2"] = 1] = "CONST2";
    MyEnum1[MyEnum1["CONST3"] = 2] = "CONST3";
})(MyEnum1 || (MyEnum1 = {}));
var MyEnum2;
(function (MyEnum2) {
    MyEnum2["CONST1"] = "CONSTANT 1";
    MyEnum2["CONST2"] = "CONSTANT 2";
    MyEnum2["CONST3"] = "CONSTANT 3";
})(MyEnum2 || (MyEnum2 = {}));
let myVariable = MyEnum2.CONST1;
console.log(myVariable);
class MyClass {
    method1() {
    }
    method2(num1, num2) {
        return 0;
    }
}

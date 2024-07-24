console.log("Hello Typescript language 2");
console.log("Hello Typescript language 2");

class Customer {
    id:string = '';
    name:string = '';
    address:string = '';
}

class Student {
    id: string;
    name: string;
    contact:string;


    constructor(id: string, name: string, contact: string) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
}

var s001 = new Student("S001","Tharindu","073243423");

console.log(s001.id,s001.name,s001.contact);
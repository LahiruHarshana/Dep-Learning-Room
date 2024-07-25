console.log("Hello Typescript language 2");
console.log("Hello Typescript language 2");

class Customer {
    id:string = '';
    name:string = '';
    address:string = '';
}

class Student {
    #id: string;
    private name: string;
    protected contact:string;

    constructor(id: string, name: string, contact: string) {
        this.#id = id;
        this.name = name;
        this.contact = contact;
    }
}

var s001 = new Student("S001","Tharindu","073243423");

// console.log(s001.id,s001.name,s001.contact);


class Employee{
    // id : string;
    // name : string;
    // address : string;
    // contact: string;

    constructor(public id: string,public name: string,public address: string, public contact: string) {
        // this.id = id;
        // this.name = name;
        // this.address = address;
        // this.contact = contact;
    }
}

var employee = new Employee("E001","Kasun Sampath","Galle","07178234");

console.log(employee);
console.log(employee.id,employee.name,employee.address,employee.contact);

class Teacher{
    readonly institute:string = 'Ijse' // instance
    constructor(public id: string, public name: string) {
    }

    print(){
        const x = 10; // local
    }
}
var t001 = new Teacher("T001","Imantha");
console.log(t001.id,t001.name,t001.institute);


abstract class MyAcstractClass{
    abstract myMethod(): void;
}

class MyConcreteClass extends MyAcstractClass{
    myMethod(): void {
    }
}

enum MyEnum1{
    CONST1,
    CONST2,
    CONST3,
}

enum MyEnum2{
    CONST1 ="CONSTANT 1",
    CONST2 ="CONSTANT 2",
    CONST3 ="CONSTANT 3"
}

let myVariable:MyEnum2 = MyEnum2.CONST1;
console.log(myVariable);


interface MyInterface {
    method1 () : void;
    method2(num1:number,num2:number) : number;
}

class MyClass implements MyInterface{
    method1(): void {
    }

    method2(num1: number, num2: number): number {
        return 0;
    }
    
}


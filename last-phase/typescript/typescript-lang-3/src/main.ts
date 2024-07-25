console.log("Hello Typescript!");


try{
    if (Math.random() <0.5){
        throw 5;
    }else{
        throw new Error('Something went wrong')
    }

}catch (e){
    if (e instanceof Error)
    console.log(e.message)
    else
        console.log("A number")
}


abstract class MyAbstractClass {
    abstract myAbstractMethod():void;
}

class MyConcreteClass extends MyAbstractClass{
    myAbstractMethod(): void {
        console.log("Abstract Method Impl")
    }

    print(num:number){
        console.log("print()")
    }
}

let myObj : MyAbstractClass = new MyConcreteClass();


enum Weekdays {
    Monday = 5,
    Tuesady,
}

enum Gender{
    MALE="MALE",
    FEMALE = 2
}

function sum(num1 : number,num2 : number):number{
    return num1 + num2;
}


//Interfaces as Type Aliases
interface Customer{
    id : string;
    name : string;
    address : string;
    print:()=> void;
}

let customer : Customer = {
    id : "E001",
    name : "Lahiru Harshana",
    address : "Galle",
    print()  {

    },
    contactList:[]
}


interface Customer{
    contactList : string []
}

//Interfaces as an Abstraction

interface CustomerService {
    // static y : number;
    // static staticMethod() : void

    saveCustomer(): void;
    updateCustomer() : void;
    /*public abstract*/ deleteCustomer( customerId : number): void;
}


class CustomerServiceImpl implements CustomerService{
    x :number = 20;
    deleteCustomer(customerId: number): void {
        console.log("Save Customer");
    }

    saveCustomer(): void {
        console.log("Update Customer");
    }

    updateCustomer(): void {
        console.log("Delete Customer");
    }
}

interface MyIn1{}
interface MyIn2{}
interface MyIn3 extends MyIn1,MyIn2{}
class System{
    static print (num:number) : void;
    static print (str:String) : void;
    static print (flag : boolean) : void;
    static print (obj:object) : void;

    static print(arg : number | string | boolean | object): void{
        console.log(arg)
    }
}

console.log("-----------------");
System.print(10);
System.print("Ijse");
System.print(true);
System.print({id: " S001", name : "Lahiru"});


type MyType1 = {
    id : string,
    name : string
    print() : void
}

type MyNewType = MyType1 & {address : string}

let obj : MyNewType = {
    id : "C001",
    name : "Kasun",
    address : 'Galle',
    print() {
        console.log("Print Method")
    }
}

class Item {
    myMethod(){
        console.log("myMethod");
    }
}

function MyDecorator(){

}
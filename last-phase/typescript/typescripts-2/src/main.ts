console.log("hai");
// 1. Type Annotations , Type Interfaces
let x : number = 10;
// x ="ABC"


//2. Type Shape
const customer = {
    id : 'C001',
    name : 'Kasun Sampath',
    address : "Galle"
}
console.log(customer.name);
//
// const employee :{id:string,name:string} = {
//     id:"E001",
//     name :"Lahiru"
// }


let employee : {
    id: number,
    name: string,
    gender : "male" | "female",
    address : string
}

employee = {
    id : 1,
    name : "tharindu",
    gender : "male",
    address : "galle"
}

let a  : 'dep' | 'cmjd ' | true | 10;
a = "dep"
a = "cmjd "


let myObj :{
    id:string,
    name:string
    print:()=> void
}

myObj ={
    id : "C001",
    name : "Kasun Sampath",
    print(){
        console.log(this.id,this.name)
    }
}

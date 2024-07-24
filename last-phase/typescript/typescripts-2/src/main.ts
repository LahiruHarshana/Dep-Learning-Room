// console.log("hai");
// 1. Type Annotations , Type Interfaces
// let x : number = 10;
// x ="ABC"
//
//
// //2. Type Shape
// const customer = {
//     id : 'C001',
//     name : 'Kasun Sampath',
//     address : "Galle"
// }
// console.log(customer.name);
//
// const employee :{id:string,name:string} = {
//     id:"E001",
//     name :"Lahiru"
//  }
//
//
// let employee : {
//     id: number,
//     name: string,
//     gender : "male" | "female",
//     address : string
// }
//
// employee = {
//     id : 1,
//     name : "tharindu",
//     gender : "male",
//     address : "galle"
// }
//
// let a  : 'dep' | 'cmjd ' | true | 10;
// a = "dep"
// a = "cmjd "
//
//
// let myObj :{
//     id:string,
//     name:string
//     print:()=> void
// }
//
// myObj ={
//     id : "C001",
//     name : "Kasun Sampath",
//     print(){
//         console.log(this.id,this.name)
//     }
// }
//
// const resuilt = myObj.print();
// console.log(resuilt)
//
//
// type imantha = boolean;
// let nidimathayi:imantha = true;

//Union Types
let asiri : string | number | boolean;
asiri = 10;
asiri =true

// asiri = 10n

// asiri = {}


let myVar : number | undefined;
// myVar = null;


// function myFunction(param1 : string , param2 :string) : string{
//     return param1 + param2;
// }
//
// type Student = {
//     id : string,
//     name : string,
//     print : () => void
// }
//
// let myStudent: Student = {
//     id : 'C001',
//     name : 'Kasun',
//     print : myPrint
// }
//
//
// function myPrint(this:Student){
//     console.log(this.id , this.name);
// }
//
// myStudent.print();
//
//
// type MyCrazyType = {
//     code : string,
//     description : string,
//     [key : string]:string   //index signature
// }
//
// const myCrazyObject : MyCrazyType = {
//     code : "I001",
//     description : "Crazy Item"
// };
//
// let myUnknown : unknown;
// myUnknown = "ijse";
//
// if (typeof myUnknown === 'string'){
//     console.log(myUnknown.toUpperCase());
// }
//
// myUnknown = 10;
//
// if (typeof myUnknown === 'number'){
//     console.log(myUnknown + 20)
//
// }


let sappa: string | null = getValue();
console.log(sappa?.toUpperCase());

function getValue(): string | null {
    return Math.random() < 0.5 ? "Direct Entry Programm" : null;
}

console.log("Hai");

const cs = Symbol();

const customer ={
    id : 'C001',
    name : 'Tharindu',
    [cs] :'3432424',
    get contact(){
        return this[cs];
    }
};

console.log(customer.id,customer.name,customer.cs);
console.log('contact' in customer);
console.log(Object.keys(customer));


console.log("===============================");

const employee ={
        id : "E001",
        firstName : "kasun",
        lastName : "sampath",
        get fullName(){
            return this.firstName+' '+this.lastName;
    },
    set fullName(fullName){
        console.log("setter")
    }
}

console.log(Object.keys(employee));
console.log(employee.fullName)
employee.id = 'E002'
employee.fullName = 'Imantha';
import axios from "axios";

const API_URL = 'https://jsonplaceholder.typicode.com/todos';
console.log(axios);

const response1 = await axios(API_URL)

console.log(response1.data);


const response2 = await axios(API_URL,{
    method : 'POST',
    data :{
        userId : 5,
        title : "New Task",
        completed:false
    },
    headers :{
        'Content-Type' : 'application/json'
    }
});

console.log(response2);
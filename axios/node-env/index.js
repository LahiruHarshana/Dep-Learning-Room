import axios from "axios";

const API_URL = 'https://jsonplaceholder.typicode.com/todos';
console.log(axios);

const response1 = await axios.get(API_URL)
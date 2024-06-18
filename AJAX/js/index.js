const btnXhrReadElm = document.getElementById("btn-xhr-read");
btnXhrReadElm.addEventListener("click", () => {
    //1. Let's create an instance of XMLHttpRequest
    const xhr = new XMLHttpRequest();

    //2. set up a call back function
    xhr.addEventListener('readystatechange', () => {
        // if(xhr.readyState === 4){
        //     console.log('RESPONSE',xhr.responseText);
        //     console.log('STATUS',xhr.status);
        //     console.log('STATUS TEXT',xhr.statusText);
        // }

        if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            console.log(JSON.parse(xhr.responseText));
            console.log('STATUS',xhr.status);
            console.log('STATUS TEXT',xhr.statusText);
        }
    });

    console.log('READY STATE',xhr.readyState);
    //3. open the request
    xhr.open('GET', 'https://jsonplaceholder.typicode.com/todos',true);

    //4. set additional headers and prepare the payload

    //5. send the request
    xhr.send();

});

const btnXhrWrite = document.getElementById("btn-xhr-write");

btnXhrWrite.addEventListener("click", () => {

    //1. create a xhr instance
    const xhr = new XMLHttpRequest();

    //2. set up a call back function
    xhr.addEventListener('readystatechange', () => {
        if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 201){
            alert('Data has been created');
        }
    });

    //3. open the request
    xhr.open('POST','https://jsonplaceholder.typicode.com/todos',true);

    //4. set additional headers and prepare the payload
    const newToDoItem = {
        userId: 1,
        id: 500,
        title: 'New To Do Item',
        completed: false
    };


    const jsonNewToDoItem = JSON.stringify(newToDoItem);

    xhr.setRequestHeader('Content-Type','application/json');

    //5. send the request
    xhr.send(jsonNewToDoItem);

});

const btnGetAllEmployees2 = document.getElementById("btn-get-all-employees-2");


const API_URL = 'https://4c6c534c-1b8e-4c80-81a4-b1f6bd98e6cc.mock.pstmn.io';


btnGetAllEmployees2.addEventListener("click", () => {
const xhr = new XMLHttpRequest();

xhr.addEventListener('readystatechange', () => {
    if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
        console.log(xhr.responseText);
    }
});

xhr.addEventListener('loadstart', () => {
    console.log('LOAD START');
});


xhr.addEventListener('loadend', () => {
    console.log('LOAD END');
});

xhr.addEventListener('load', () => {
    console.log('LOAD');
});


xhr.addEventListener('readystatechange', () =>{
    console.log('READY STATE',xhr.readyState);
});
xhr.open('GET', `${API_URL}/employees/E001`,true);

console.log('Open');

xhr.send();
console.log('Send');

});
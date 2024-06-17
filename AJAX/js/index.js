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

    xhr.setRequestHeader('Content-Type','application/json');
});
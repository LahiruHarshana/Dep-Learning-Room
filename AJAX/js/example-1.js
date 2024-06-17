const txtId = document.getElementById("txt-user-id");

txtId.addEventListener("change", () => {

    //1. Let's create an instance of XMLHttpRequest
    const xhr = new XMLHttpRequest();

    //2. set up a call back function
    xhr.addEventListener('readystatechange', () => {

        if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            const todoItems = JSON.parse(xhr.responseText);
        }
    });
    //3. open the request
    xhr.open('GET', 'https://jsonplaceholder.typicode.com/todos/'+e.target.value,true);

    //4. set additional headers and prepare the payload

    //5. send the request
    xhr.send();
});
const btnXhrReadElm = document.getElementById("btn-xhr-read");
btnXhrReadElm.addEventListener("click", () => {
    //1. Let's create an instance of XMLHttpRequest
    const xhr = new XMLHttpRequest();

    //2. set up a call back function
    xhr.addEventListener('readystatechange', () => {
        console.log('AWAITING RESPONSE');
    });

    //3. open the request
    xhr.open('GET', 'https://jsonplaceholder.typicode.com/posts',true);

    //4. set additional headers and prepare the payload

    //5. send the request
    xhr.send();

});
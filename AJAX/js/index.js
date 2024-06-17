const btnXhrReadElm = document.getElementById("btn-xhr-read");
btnXhrReadElm.addEventListener("click", () => {
    //1. Let's create an instance of XMLHttpRequest
    const xhr = new XMLHttpRequest();

    //2. set up a call back function
    xhr.addEventListener('readystatechange', () => {

    });

    //3. open the request
    xhr.open('GET', 'http://ijse.lk',true);

    //4. set additional headers and prepare the payload

    //5. send the request
    xhr.send();

});
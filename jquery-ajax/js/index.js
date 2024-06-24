console.log(jQuery === $);

const URL = 'https://jsonplaceholder.typicode.com/todos';

$('#btn-send-get-request').on('click',()=>{
    $.ajax(URL)
        .then(data => console.log(data))
        .catch(err => console.log("ERROR",err))
        .always(() => console.log("Nawa Gilunath ban choon"));
})
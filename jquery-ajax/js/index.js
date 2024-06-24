console.log(jQuery === $);

const URL = 'https://jsonplaceholder.typicode.com/todos';

$('#btn-send-get-request').on('click',()=>{
    $.ajax(URL)
        .then(data => console.log(data))
        .catch(err => console.log("ERROR",err))
        .always(() => console.log("Nawa Gilunath ban choon"));
})


$('#btn-send-post-request').on('click', async ()=>{
    const response = await fetch(URL ,{
        method : 'POST',
        body : JSON.stringify({
            userId : 1,
            title : "New To-do Ite",
            completed : false
        }),
        headers :{
            'Content-Type':'applocation/json'
        }
    });


    const data = await $.ajax(URL,{
        method: "POST",
        data:JSON.stringify({
            userId : 1 ,

        })
    })
})
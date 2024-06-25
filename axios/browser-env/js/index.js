console.log("axios" in globalThis);


    axios.interceptor.request.use(
    (config)=>{
        console.log("Now we can intercept the request before" +
            "it send to the server");
        console.log('REQUEST:',config);
        return config;
    });

    axios.interceptor.response.use(
    (config)=>{
        console.log("Now we can intercept the request before" +
            "it send to the server");
        console.log('RESPONSE:',config);
        return config;
    });

const btnSendGetRequest = document.getElementById('btn-send-get-request');

const btnSendPostRequest = document.getElementById('btn-send-post-request');

const API_URL = 'https://jsonplaceholder.typicode.com/todos';
btnSendPostRequest.addEventListener('click',async ()=>{
    const response1 = await fetch(API_URL,{
        method :'POST',
        body : JSON.stringify({
            userId :1,
            title:"new Task",
            completed : false
        }),
        headers:{
            'Content-Type':'application/json'
        }
    });

    const responseBody1 = await response1.json()
    console.log("Fetch RESPONSE BODY :" ,responseBody1);



    const response2 = await axios(API_URL,{
        method: "POST",
        data:{
            userId :1,
            title: "New Task",
            completed: false
        },
        headers: {
            'Content-Type':'application/json'
        }
    });
});

btnSendGetRequest.addEventListener('click', async ()=>{
    const response1 = await fetch(API_URL);
    console.log("FETCH DATA:" , await response1.json());

    const response2 = await axios(API_URL);
    console.log("AXIOS DATA",response2.data);
});
const txtId = document.getElementById("txt-user-id");

txtId.addEventListener("change", () => {

    //1. Let's create an instance of XMLHttpRequest
    const xhr = new XMLHttpRequest();

    //2. set up a call back function
    xhr.addEventListener('readystatechange', () => {

        if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
            const todoItems = JSON.parse(xhr.responseText);

            createTodoItems(todoItems);


            // createTodoItems(todoItems.filter(
            //     todoItem => todoItem.userId === parseInt(txtId.value)
            //
            // ));
        }
    });


    const searchParams = new URLSearchParams();
    searchParams.append('userId', txtId.value);
    //3. open the request
    xhr.open('GET', `https://jsonplaceholder.typicode.com/todos?${searchParams.toString()}`,true);

    //4. set additional headers and prepare the payload

    //5. send the request
    xhr.send();
});

function createTodoItems(todoItems){
    const toDoListElm = document.querySelector('#todo-list');
    toDoListElm.querySelectorAll('.todo-items').forEach(elm => elm.remove());
    for (const todoItem of todoItems){
        const toDoItemElm = document.createElement('p');
        toDoItemElm.classList.add('d-flex','gap-2','todo-items');
        toDoItemElm.innerHTML = `
            <input id="chk-${todoItem.id}" ${todoItem.completed ? 'checked':''} type="checkbox" class="form-check-input">
            <label for="chk-${todoItem.id}" class="form-check-label">${todoItem.title}</label>
        `;
        toDoListElm.appendChild(toDoItemElm);
    }
}
const btnBack = document.getElementById("btn-go-back");
const btnForward = document.getElementById("btn-go-forward");


btnBack.addEventListener('click',()=>{
    history.back();
});

btnForward.addEventListener('click',()=>{
    history.forward();
});

const btnFirstPage = document.getElementById('btn-first-page');
const btnSecondPage = document.getElementById('btn-second-page');


btnFirstPage.addEventListener('click',()=>{
    history.pushState('first',null,'first.html');
    displayUI('first')
});
btnSecondPage.addEventListener('click',()=>{
    history.pushState('second',null,'second.html');
    displayUI('second')
});


const firstUi = document.getElementById('first-ui');
const secondUi = document.getElementById('second-ui');
addEventListener('popstate',(e)=> displayUI(e.state));



function displayUI(state){
    firstUi.classList.add('hide');
    secondUi.classList.add('hide');
    console.log("State: ",state?.state);
    switch (state.state){
        case "first":
            break;
        case "second":
            break;
    }
};


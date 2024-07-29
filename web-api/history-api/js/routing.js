const btnBack = document.getElementById("btn-go-back");
const btnForward = document.getElementById("btn-go-forward");


btnBack.addEventListener('click',()=>{
    history.back();
});

btnBack.addEventListener('click',()=>{
    history.forward();
});
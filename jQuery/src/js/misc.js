import $ from 'jquery';


const target = $('#target');


$('#btn-show').on('click',()=>{
    target.show(1000);
});

$('#btn-hide').on('click',()=>{
    target.hide(500);   //display : none
});

$('#btn-fade-in').on('click',()=>{
    target.fadeIn(1000);
});

$('#btn-fade-out').on('click',()=>{
    target.fadeOut(1000,()=>{
        alert("Fade out completed")
    });
});
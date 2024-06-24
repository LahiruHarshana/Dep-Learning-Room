import $ from 'jquery';


const target = $('#target');


$('#btn-show').on('click',()=>{
    target.show(1000);
});

$('#btn-hide').on('click',()=>{
    target.hide(500);   //display : none
});
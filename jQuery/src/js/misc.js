import $ from 'jquery';


const target = $('#target');


$('#btn-show').on('click',()=>{
    target.show();
});

$('#btn-hide').on('click',()=>{
    target.hide();
});
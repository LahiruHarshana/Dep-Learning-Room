import $ from 'jquery';
import alert from "bootstrap/js/src/alert";

const btnAppend = $('#btn-append');
const btnPrepend = $('#btn-prepend');
const btnInsertAfter = $('#btn-insert-after');
const btnInsertBefore = $('#btn-insert-before')


btnAppend.on('click',()=>{
    alert('append');
});

btnPrepend.on('click',()=>{

});

btnInsertAfter.on('click',()=>{
$('#list-1>li').eq(1).after("<li></li>>")
});

btnInsertBefore.on('click',()=>{
const jQueryHtml = $("<li>Before Second</li>>");
$('#list-1'>li).eq(1).before(jQueryHtml);
});

$("#list-2 > li").first().children("a").on('click',()=>{
    alert('Hello');
});

$("#btn-clone").on('click',()=>{
    const cloneLi = $("#list-2 > li").first().clone();
    $('#list-2').append(cloneLi);
});

$('#btn-remove').on('click',()=>{
    $("#list-2 li:not(#list-2 li:first-child)").remove();
});


$('#btn-replace').on('click',()=>{
    alert("Replace");
})
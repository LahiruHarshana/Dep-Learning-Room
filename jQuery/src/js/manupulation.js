import $ from 'jquery';

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



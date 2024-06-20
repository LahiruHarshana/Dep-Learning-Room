import $ from 'jquery';

const btnAppend = $('#btn-append');
const btnPrepend = $('#btn-prepend');
const btnInsertAfter = $('#btn-insert-after');
const btnInsertBefore = $('#btn-insert-before')


btnAppend.on('click',()=>{
    alert('hai');
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
    $('.target-1').html("Random : "+Math.random() + "<button>Reset</button>");
});

$('#btn-replace-with').on('click',()=>{
$(".target-2").replaceWith("<Button>Reset</Button>");
});


$('#btn-set-tooltip-text').on('click',()=>{
    $("h2").attr("tittle","Hello Manipulation");
});

$('#btn-get-tooltip-text').on('click',()=>{
    alert($("h2").attr("tittle"));
});

$('#set-image-src').on('click',()=>{
    // $('#picture').attr("src",'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3cZP7bGqm5f0Xjk_OxSNra3rJ1sfTRGpf7QrbVMkGrnB3RdVBl2E2xE_UIK3xnl_4RXg&usqp=CAU')
    $('#picture').prop("src",'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3cZP7bGqm5f0Xjk_OxSNra3rJ1sfTRGpf7QrbVMkGrnB3RdVBl2E2xE_UIK3xnl_4RXg&usqp=CAU')
});

$('#clear-image-src').on('click',()=>{
    $('picture').prop("src","");
})


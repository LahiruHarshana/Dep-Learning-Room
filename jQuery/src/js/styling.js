import $ from 'jquery';

const box = $("#box");
$("#btn-change-color").on('click',()=>{
    const b1 =Math.random() * 256;
    const r1 =Math.random() * 256;
    const r2 =Math.random() * 256;
    const g2 =Math.random() * 256;
    const b3 =Math.random() * 256;

    box.css('background-color',`rgb(${r1},${g2},${b1})`).css('border-color',`rgb(${r2},${g2},${b2})`);
});

$("#btn-get-color").on('click',()=>{
console.log("border-color: ", box.css("border-color"));
console.log("background-color: ",box.css("background-color"));
});
$("#btn-get-dimensions").on('click',()=>{

});

console.log("Width : ",$("#elm").width(),"100px");
console.log("Height : ",$("#elm").height(),"100px");
console.log("InnerWidth : ",$("#elm").innerWidth(),"140px");
console.log("InnerHeight : ",$("#elm").innerHeight(),"170px");
console.log("OuterWidth : ",$("#elm").outerWidth(),"170px");
console.log("OuterHeight : ",$("#elm").outerHeight(true),"210px");
console.log("MariginHeight : ",$("#elm").outerHeight(true),"210px");

console.log($("#elm").offset());
console.log($("#elm").position());

$("#elm").scroll


const h1Target = $('#h1-target');
$('#btn-add-class').on('click',()=>{

    h1Target.add('red');
});
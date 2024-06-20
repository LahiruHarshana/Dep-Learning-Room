import $ from 'jquery';

const btnSetEvent = $("#btn-set-events");
const btnOffEvent1 = $("#btn-off-event-1");
const btnOffEvent2 = $("#btn-off-event-2");
const btnClearEvents = $("#btn-clear-events");
const btnClickMe = $("#btn-click-me");


// [btnClearEvents,btnClickMe,btnOffEvent2,btnOffEvent1,btnClearEvents,btnSetEvent].forEach(e=>e.remove());


const fn1 =()=> console.log("call back fn 1");
const fn2 =()=> console.log("call back fn 2");

let event1 = false;
let event2 = false;

btnSetEvent.on('click',()=>{

    if (event1 || event2){
        alert("Events Listeners have been already attachment");
        return;
    }

    btnClickMe.on('click',fn1);
    btnClickMe.on('click',fn2);
});

btnOffEvent1.on('click',()=>{
    btnClickMe.off('click',fn2);
    event1 = false;
});


btnOffEvent2.on('click',()=>{
    btnClickMe.off('click',fn2);
    event2 = false;
});

btnClearEvents.on('click',()=>{
    btnClickMe.off('click');
    event2 = false;
    event1 = false;
});

const liElm = $("ul>li:first-child").clone();

$('#btn-genarate-more-items').on('click',()=>{
    for (let i =0;i<5;i++){
        $("ul").append(liElm.clone())
    }

});

$('#btn-clear-all-items').on('click',()=>{
    $("ul > li").remove();
});


$("ul").on("click","li > button",()=>{
    alert("okay");
});




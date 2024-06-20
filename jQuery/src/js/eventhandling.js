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





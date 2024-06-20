import $ from 'jquery';

const btnSetEvent = $("#btn-set-events");
const btnOffEvent1 = $("#btn-off-event-1");
const btnOffEvent2 = $("#btn-off-event-2");
const btnClearEvents = $("#btn-clear-events");
const btnClickMe = $("#btn-click-me");


[btnClearEvents,btnClickMe,btnOffEvent2,btnOffEvent1,btnClearEvents,btnSetEvent].forEach(e=>e.remove());
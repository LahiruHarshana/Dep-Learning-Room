import $ from 'jquery';

const li2Elm = $("#li-2");

li2Elm.css('background-color','Yellow');
li2Elm.next().css('background-color','red');
li2Elm.prev().css('background-color','red');

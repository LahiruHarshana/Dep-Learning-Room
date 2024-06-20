import $ from 'jquery';

const li2Elm = $("#li-2");

li2Elm.css('background-color','Yellow');
//nextSibilingElement
li2Elm.next().css('background-color','red');
//parent
li2Elm.prev().css('background-color','red');

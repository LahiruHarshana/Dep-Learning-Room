import $ from 'jquery';

const li2Elm = $("#li-2");

li2Elm.css('background-color','Yellow');
//nextSibilingElement
li2Elm.next().css('background-color','red');
//parentElm
li2Elm.prev().css('background-color','red');


li2Elm.parent("body").css('background-color','lightblue');
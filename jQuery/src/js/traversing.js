import $ from 'jquery';

const li2Elm = $("#li-2");

li2Elm.css('background-color','Yellow');
//nextSibilingElement
li2Elm.next().css('background-color','red');
//parentElm
li2Elm.prev().css('background-color','red');

//closets
li2Elm.parent("body").css('background-color','lightblue');

$(li2Elm.parent().children().get(3)).css('border','2px solid black');
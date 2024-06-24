import $ from 'jquery';

const txtId = $('#txt-id');
const txtName = $('#txt-name');
const txtAddress = $('#txt-address');
const cbMemberShipType = $('#cb-membership-type');


$("form").on('submit',(e)=>{
    e.preventDefault();
    console.log("ID :",txtId.val());
    console.log("Name :",txtName.val());
    console.log("Address :",txtAddress.val());
    console.log("MemberShip :",cbMemberShipType.val());

    // txtId.val("");
    // txtName.val("");
    // txtAddress.val("");
    // cbMemberShipType.val("silver");

    console.log($("form").serialize())
})
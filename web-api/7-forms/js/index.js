const chkProfile =document.getElementById("chk-profile");
const flProfilePic = document.getElementById("fl-profile-picture");

chkProfile.addEventListener("change", ()=>{
    flProfilePic.disabled  = !chkProfile.checked;
});


flProfilePic.accepts = "image/*";


// const btnSaveEl = document.getElementById("btn-save");

const btnClearEl = document.getElementById("btn-clear");

const form = document.getElementById("form");

btnClearEl.addEventListener("click", ()=>{
    form.reset();
});

// btnSaveEl.addEventListener("click", ()=>{
//     form.submit();
// });

form.addEventListener("submit", (e)=> {
    const id = document.querySelector('[name="id"]');
    const name = document.querySelector('[name="name"]');


    e.preventDefault();

    if (!/^\d{3}$/.test(id.value)) {
        id.focus();
        name.select();
        e.preventDefault();
    } else if (!/^[A-Za-z]+$/.test(name.value.trim())) {
        name.focus();
        name.select();
        e.preventDefault();
    }else if (chkProfile.checked && !flProfilePic.files.length) {
        flProfilePic.focus();
        e.preventDefault();

    }

});
form.addEventListener("formdata", (e)=>{
    e.formData.append("profile", "lahiru");
    e.formData.append("chkProfile", "true");
    console.log(e);
    debugger;
});

const formData = new FormData();
formData.append("id", "123");
formData.append("name", "lahiru");
formData.append("profile", "lahiru");
console.log(new URLSearchParams(formData).toString());

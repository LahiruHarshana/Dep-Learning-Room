const btnClearElm = document.getElementById('btn-clear');
const btnBrowseElm = document.getElementById('btn-browse');
const btnSaveElm = document.getElementById('btn-save');
const flPucture = document.getElementById('fl-picture');


btnBrowseElm.addEventListener('click', () => {
    flPucture.click();
});

flPucture.addEventListener('change', () => {
    if (flPucture.files.length){
        }

});
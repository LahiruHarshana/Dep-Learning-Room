const btnClearElm = document.getElementById('btn-clear');
const btnBrowseElm = document.getElementById('btn-browse');
const btnSaveElm = document.getElementById('btn-save');
const flPucture = document.getElementById('fl-picture');


btnBrowseElm.addEventListener('click', () => {
    flPucture.click();
});

const picture = document.getElementById('picture');

flPucture.addEventListener('change', () => {
    if (flPucture.files.length){

        //1.Method (Via URL API)
        // const imageFile = flPucture.files.item(0);
        //const imageBlob = new Blob([imageFile], {type: imageFile.type});
        // const dataUrl = URL.createObjectURL(imageFile);
        // picture.style.backgroundImage =
        //     `url('${dataUrl}')`;

        //2. Method (via Canvas API)
        const imageFile = flPucture.files.item(0);

        const canvasElm = document.createElement('canvas');
        canvasElm.classList = 'border';

        document.body.append(canvasElm);

        const contex = canvasElm.getContext('2d');

        const fileReader = new FileReader();

        fileReader.addEventListener('load',(e)=>{
            console.log(e.target.result);
            flPucture.style.backgroundImage = `url('${e.target.result}')`;
        });
        fileReader.readAsDataURL(imageFile);


        contex.drawImage(imageFile);
        }else {
        alert("No file has been selected")
    }

});
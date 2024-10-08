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
        const imageFile = flPucture.files.item(0);
        //const imageBlob = new Blob([imageFile], {type: imageFile.type});
        const dataUrl = URL.createObjectURL(imageFile);
        picture.style.backgroundImage =
            `url('${dataUrl}')`;

        //2. Method (via File Reader API)
        // const imageFile = flPucture.files.item(0);
        //
        // const canvasElm = document.createElement('canvas');
        // canvasElm.classList = 'border';
        //
        // document.body.append(canvasElm);
        //
        // const contex = canvasElm.getContext('2d');
        //
        // const fileReader = new FileReader();
        //
        // fileReader.addEventListener('load',(e)=>{
        //     console.log(e.target.result);
        //     picture.style.backgroundImage = `url('${e.target.result}')`;
        // });
        // fileReader.readAsDataURL(imageFile);
        // contex.drawImage(imageFile);


        //3.Method (Via Canvas API)

        //  const imageFile = flPucture.files.item(0);
        //
        // const canvasElm = document.createElement('canvas');
        // canvasElm.classList = 'border';
        //
        // document.body.append(canvasElm);
        //
        // const context = canvasElm.getContext('2d');
        //
        // const image = new Image();
        // image.addEventListener('load',()=>{
        //    context.drawImage(image,0,0,150,150);
        //    picture.style.backgroundImage = `url('${canvasElm.toDataURL()}')`
        // });
        //
        // image.src = URL.createObjectURL(imageFile);
        // }else {
        // alert("No file has been selected")
    }else{
        picture.style.backgroundImage = '';
    }

});

flPucture.accepts = 'image/*';

const frmElm = document.querySelector('form');

const status = document.getElementById('status');

const progressWrapperElm = document.getElementById('progress-wrapper');
const progressBarElm = document.getElementById('progress-bar');
frmElm.addEventListener('submit',(e)=>{
    if (!flPucture.files.length){
        e.preventDefault();
        alert("Select a picture");
        btnBrowseElm.focus();
    }
});

frmElm.addEventListener('formdata',(e)=>{

    progressWrapperElm.classList.remove('d-none');
    const xhr = new XMLHttpRequest();

    xhr.addEventListener('loadend',()=>{
        progressWrapperElm.classList.add('d-none');
        progressBarElm.style.width = '0';
        status.innerText = `Uploading 0%`;
    });

    xhr.upload.addEventListener('progress',(e)=>{
        if (e.lengthComputable){
            const progress = e.loaded / e.total *100;
            progressBarElm.style.width =`${progress}%`;
            status.innerText = `uplaoding ${progress.toFixed(2)}%`;
        }
    });

    xhr.upload.addEventListener('load',()=>{
        status.innerText = `Succesfully Uploaded!`
    });

    xhr.upload.addEventListener('error',()=>{
        status.innerText = `Upload Failure`;
    })

    const url= 'https://b9b2ef66-b754-4431-92c6-33588b8a6dfe.mock.pstmn.io';
    xhr.open('POST',url,true);
    xhr.send(e.formData);
});

btnClearElm.addEventListener('click',()=>{
   picture.style.backgroundImage = '';
});

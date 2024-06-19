const downloadImage = 'https://images.pexels.com/photos/24879566/pexels-photo-24879566.jpeg?cs=srgb&dl=pexels-kokorevas-24879566.jpg&fm=jpg&w=4000&h=5600&_gl=1*ufdq4l*_ga*NTkxMjM0ODA1LjE3MDM2ODE1MTY.*_ga_8JE65Q40S6*MTcxODc4MjQyOS4xMi4xLjE3MTg3ODI0MzMuMC4wLjA.';

const imgElm = document.getElementById("img");
document.getElementById("btn-download").addEventListener("click", () => {
    const xhr = new XMLHttpRequest();
    xhr.responseType = 'arraybuffer';
    xhr.addEventListener('load', () => {
        const byteArray = [xhr.response];
        const blob = new Blob(byteArray, {type: 'image/jpeg'});
    });
    xhr.open('GET', downloadImage,true);
    xhr.send();
});
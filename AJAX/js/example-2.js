const downloadImage = 'https://unsplash.com/photos/kdEV33elbw8/download?ixid=M3wxMjA3fDB8MXxhbGx8fHx8fHx8fHwxNzE4NzIzNjczfA&force=true';

const imgElm = document.getElementById("img");
document.getElementById("btn-download").addEventListener("click", () => {
    const xhr = new XMLHttpRequest();
    xhr.addEventListener('load', () => {
        console.log(xhr.responseType);

    });

    xhr.open('GET', downloadImage,true);
    xhr.send();
});
const downloadImage = 'https://pbs.twimg.com/profile_images/1701878932176351232/AlNU3WTK_400x400.jpg';

const imgElm = document.getElementById("img");
document.getElementById("btn-download").addEventListener("click", () => {
    const xhr = new XMLHttpRequest();
    xhr.addEventListener('load', () => {

    });
    xhr.open('DELETE', downloadImage,true);
    xhr.send();
});
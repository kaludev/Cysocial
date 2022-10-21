

setInterval(CreateBinary,5);
function CreateBinary() {
    let i = Math.round(Math.random()*window.innerWidth / (2 * parseFloat(getComputedStyle(document.documentElement).fontSize)));
    let element = document.createElement("div");
    element.classList.add('animate');
    element.innerText = Math.round(Math.random()).toString();
    element.style.left = Math.round(i* 2 * parseFloat(getComputedStyle(document.documentElement).fontSize))+'px';
    element.addEventListener('animationend',(event) =>{
        document.body.removeChild(event.target);
    });
    document.body.appendChild(element);
}

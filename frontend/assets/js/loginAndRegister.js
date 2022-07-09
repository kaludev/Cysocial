//responsive
let login = document.querySelector('.login').querySelector('.row');
let image = document.querySelector('.navbar-image');
let imageLoginDiv = login.querySelector('.loginImage')
document.querySelector('.navbar-brand').removeChild(image);
login.removeChild(imageLoginDiv);

let checkWidth = () => {
    if(window.innerWidth >992){
        if(document.querySelector('.loginImage') == null){
            login.insertBefore(imageLoginDiv,document.querySelector('.form'));
            if(document.querySelector('.navbar-brand').querySelector('.navbar-image') != null){
            document.querySelector('.navbar-brand').removeChild(image);
            }
        }
    }else{
        if(document.querySelector('.navbar-image') == null){
            document.querySelector('.navbar-brand').insertBefore(image,document.querySelector('.navbar-brand').querySelector('span'));
            if(login.querySelector('.loginImage') != null){
                login.removeChild(imageLoginDiv);
            }
        }
        
    }
}
checkWidth();
window.addEventListener('resize',checkWidth)

// login/register switch

let loginBtn = document.querySelector('#loginBtn');
let registerBtn = document.querySelector("#registerBtn");
let form = document.querySelector('form')
let Name = document.querySelector('#Name');
let sName = document.querySelector('#name').parentNode.parentNode;
let username = document.querySelector('#Username').parentNode;
let passwordNode = document.querySelector('#Password2').parentNode.parentNode;
let password  = document.querySelector('#Password2').parentNode
form.removeChild(sName);
form.removeChild(username);
passwordNode.removeChild(password)
document.querySelector('#Password').parentNode.classList.remove('col-5');
//Event listeners
loginBtn.addEventListener('click',()=>{
    if(!loginBtn.classList.contains('active')){
        Name.textContent = "Login"
        loginBtn.classList.add('active');
        registerBtn.classList.remove('active');
        form.removeChild(sName);
        form.removeChild(username);
        passwordNode.removeChild(password)
        document.querySelector('#Password').parentNode.classList.remove('col-5');
    }
}
)
registerBtn.addEventListener('click', () =>{
    if(!registerBtn.classList.contains('active')){
        Name.textContent = "Register";
        registerBtn.classList.add('active');
        loginBtn.classList.remove('active');
        form.insertBefore(sName,form.querySelector('#Email1').parentNode);
        form.insertBefore(username,form.querySelector('#Email1').parentNode);
        document.querySelector('#Password').parentNode.classList.add('col-5');
        passwordNode.appendChild(password)

    }
})
document.querySelector('form').querySelector('button').addEventListener('click',() =>{
    location.href = './assets/pages/main.html';
})


let checkWidth = () => {
    if(window.innerWidth >768){
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
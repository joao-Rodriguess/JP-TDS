var meuVideo = document.getElementById("player");

function playPause(){
     if(meuVideo.paused){
        meuVideo.play();
     }
    else{
        meuVideo.pause();
    }
}

function makeBig(){
    meuVideo.width = 700;
}

function makeSmall(){
    meuVideo.width = 300;
}

function makeNormal(){
    meuVideo.width = 450;
}

function telaCheia(){
    meuVideo.requestFullscreen();
}

function aumentarVolume(){
    meuVideo.volume += 0.1;
}

function diminuirVolume(){
    meuVideo.volume -= 0.1;
}

function mutar(){
    meuVideo.muted = true;
}

function desmutar(){
    meuVideo.muted = false;
}
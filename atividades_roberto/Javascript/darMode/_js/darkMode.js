function darkMode(){
    let element = document.body
    let content = document.getElementById("DarkModeText");
    element.className = "dark-mode";
    content.innerHTML = "Tema escuro ativado"
}

function Lightmode(){
    let element = document.body
    let content = document.getElementById("DarkModeText");
    element.className = "light-mode";
    content.innerHTML = "Tema luz ativado"
}
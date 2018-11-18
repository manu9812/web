function ejecutar(){
document.querySelector(".importante").oneClick=saludar;
var elementos= document.querySelectorAll("#principal p")[0].oneClick=saludar;
for(var i=0; i<elementos.length; i++){
}
elementos[i].oneClick=saludar;
}

function saludar(){
    alert("que hay de nuevo viejo")
}
window.onload=ejecutar;
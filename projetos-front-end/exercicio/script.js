

let btn = document.getElementById('btn');
btn.addEventListener('click', clicar);
function clicar(){
    let inicio_btn = document.getElementById('inicio_btn');
    let fim = document.getElementById('fim_btn');
    let passo = document.getElementById('passo');
    let resultado = document.getElementById('resultado');
    let n1 = inicio_btn;
    for(n1; n1<fim; n1+=passo){
        resultado.innerHTML = n1
    }
}
var prompt = require('prompt-sync')();



// let numero = Number(prompt('Que número deverá ser testado? '));

// function par(numero){
//     if(numero % 2 == 0){
//         return true;
//     }
//     else{
//         return false;
//     }
// }

// if (par(numero) === true) {
//     console.log('é par');
// }
// else{
//     console.log('é ímpar');
// }

let numero = Number(prompt('digite o valor que quer descobrir se é primo: '));

function primo(valor){
    
    for (let i = 2; i < valor; i++) {
        if (valor%i!=0) {
            return true;
        }
        else{
            return false;
        }
    }
if(primo(numero)){
    console.log(`${numero} é primo.`);
}
else{
    console.log(`${numero} não é primo.`);
}
}

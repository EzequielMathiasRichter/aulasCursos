
var prompt = require('prompt-sync')();
/*
let base = prompt('Qual o úmero que você quer usar como base?');
let expoente = prompt('Qual o úmero que você quer usar como expoente?');
let resultado = 1;
for (let i = 1; i<expoente; i++){
    resultado*=base;
}
console.log(resultado);
*/
/*
let soma = 0
let valor = Array(cds)
var cds = prompt('Qual o número de CDs?')
for(i=0;i<cds;i++){
    valor[i]= Number(prompt('qual o valor?'))
}
for(u=0;u<cds;u++){
    soma = soma + valor[u]
}
console.log('média:', soma/cds);
*/
let soma = 0;
let a = Number(prompt('quantas temperaturas serão analisadas?'));
let vetor = []
for(i=0;i<a;i++){
    vetor[i] = Number(prompt('Quais são as temperaturas da semana?'));
}
let B = vetor[0];
let C = vetor[0];
for(u=0;u<a;u++){
    soma = soma + vetor[u];
}
console.log('Média:', soma/a); 
for(let l=0;l<vetor.length;l++){
    if(vetor[l]>B){
        B=vetor[l];
    }
}
for(let k=0;k<vetor.length;k++){
    if(vetor[k]<C){
      C=vetor[k];
    }
}
console.log(`A maior temperatura é ${B} e a menor é ${C}`);
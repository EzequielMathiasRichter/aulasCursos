var prompt = require('prompt-sync')();
// /*
// var idade = prompt('Qual sua idade?');
// console.log(idade>=18?'Acesso permitido':'Acesso negado');
// */
// let salto = [];

// for(let i=0;i<5;i++){
//     salto[i] = Number(prompt(`Qual a distancia do ${i+1}° salto:`));
// }
// let maior = salto[0];
// let menor = salto[0];
// for(let u = 0; u<salto.length;u++){
//     if(salto[u]>maior){
//     maior=salto[u];
//     }
//     else if(salto[u]<menor){
//         menor=salto[u];
//     }
// }
// let somaMaiorMenor = maior+menor;
// let media = (salto[0]+salto[1]+salto[2]+salto[3]+salto[4]-somaMaiorMenor)/3;
// console.log(`O melhor salto foi ${maior}, o pior salto foi ${menor} e a média fora o melhor e o pior valor é igual a: ${media}`);

let altura = [];
let peso = [];
let codigo = [];
let i = 0;
let mediaPeso = 0;
let mediaAltura = 0;
let somaAltura = 0;
let somaPeso = 0; 
let posicao1 = 0;
let posicao2 = 0;
let posicao3 = 0;
let posicao4 = 0;


do{
    codigo[i] = Number(prompt('Qual seu código de cliente?'));
    if(codigo[i]==0){
        break;
    }
    altura[i] = Number(prompt('Qual sua altura?'));
    peso[i] = Number(prompt('Qual seu peso?'));
    i++
}while(i!=0);

let P = peso[0];
let A = altura[0];
let Pmenor = peso[0];
let Amenor = altura[0];
let codigo1 = codigo[0];
let codigo2 = codigo[0];
let codigo3 = codigo[0];
let codigo4 = codigo[0];

for(let u = 0; u<peso.length; u++){
    if(peso[u]>P){
        P=peso[u];
        posicao1 = u;
        codigo1 = codigo[u];
    }
    else if (peso[u]<Pmenor){
        Pmenor=peso[u];
        posicao2 = u;
        codigo2 = codigo[u];
    }
}

for(let y=0;y<altura.length;y++){
    if(altura[y]>A){
        A=altura[y];
        posicao3=y;
        codigo3 = codigo[y];
    }
    else if(altura[y]<Amenor){
        Amenor=altura[y];
        posicao4=y;
        codigo4 = codigo[y];
    }
}

for(let l=0;l<altura.length;l++){
    somaAltura+=altura[l];
}

for(let o=0;o<peso.length;o++){
    somaPeso+=peso[o];
}

mediaAltura=somaAltura/altura.length;

mediaPeso=somaPeso/peso.length;

console.log(`O maior peso é ${P} com o código ${codigo1} o menor peso é ${Pmenor} com o código ${codigo2}. A maior altura é ${A} com o código ${codigo3} a menor altura é ${Amenor} com o código ${codigo4}.`);

console.log(`Média peso: ${mediaPeso}. Média altura:${mediaAltura} `);
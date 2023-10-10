/*
Trabalho final
O cardápio de uma lanchonete é o seguinte:
Especificações         código           preço
Cachorro quente         100             R$:1,20
Bauru simples           101             R$:1,30
Bauru com ovo           102             R$:1,50
Hambúrguer              103             R$:1,20
Cheeseburguer           104             R$:1,30
Refrigerante            105             R$:1,00

Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
Calcule e mostre o valor a ser pago por item (preço + quantidade) e o total geral do pedido.
O pedido é encerrado quando o cliente digitar o código 999.
Controlar para que o cliente só possa digitar os códigos do menu
Caso digite o código errado aparecerá uma mensagem de código inválido 


Ex:
cod 100      15        115,00
Cod 101      10        100,00
Valor total R$:215,00

*/


var prompt = require('prompt-sync')();
let codigo = [];
let i = 0;
let quantidade100 = [];
let quantidade101 = [];
let quantidade102 = [];
let quantidade103 = [];
let quantidade104 = [];
let quantidade105 = [];

do {
    codigo[i]=Number(prompt('Qual o código do pedido?'))
    if (codigo[i]==100) {
        quantidade100[i]=Number(prompt('Qual a quantidade de itens?'))
        if (isNaN(quantidade100[i])) {
            console.log('Valor inválido');
        }
    }
    else if (codigo[i]==101) {
        quantidade101[i]=Number(prompt('Qual a quantidade de itens?'))
        if (isNaN(quantidade101[i])) {
            console.log('Valor inválido');
        }
    }
    else if (codigo[i]==102) {
        quantidade102[i]=Number(prompt('Qual a quantidade de itens?'))
        if (isNaN(quantidade102[i])) {
            console.log('Valor inválido');
        }
    }
    else if (codigo[i]==103) {
        quantidade103[i]=Number(prompt('Qual a quantidade de itens?'))
        if (isNaN(quantidade103[i])) {
            console.log('Valor inválido');
        }
    }
    else if (codigo[i]==104) {
        quantidade104[i]=Number(prompt('Qual a quantidade de itens?'))
        if (isNaN(quantidade104[i])) {
            console.log('Valor inválido');
        }
    }
    else if (codigo[i]==105) {
        quantidade105[i]=Number(prompt('Qual a quantidade de itens?'))
        if (isNaN(quantidade105[i] === true)) {
            console.log('Valor inválido');
        }
        else{
            quantidade105[i] = quantidade105[i]
        }
    }
    else if (codigo[i]==999) {
        break
    }
    else if(codigo[i]!=100 && codigo[i]!=101 && codigo[i]!=102 && codigo[i]!=103 && codigo[i]!=104 && codigo[i]!=105 && codigo[i]!=999){
        console.log('Código inválido');
    }
 
    i++
    
} while (i != 0);
let soma100 = 0;
let total100 = 0;
let soma101 = 0;
let total101 = 0;
let soma102 = 0;
let total102 = 0;
let soma103 = 0;
let total103 = 0;
let soma104 = 0;
let total104 = 0;
let soma105 = 0;
let total105 = 0;
for(let o = 0; o<quantidade100.length; o++){
    soma100 += quantidade100[o];
}
    total100 = soma100*1.20;
    

for(let y = 0; y<quantidade101.length; y++){
    soma101 += quantidade101[y];
}
    total101 = soma101*1.30;

for(let t = 0; t<quantidade102.length; t++){
    soma102 += quantidade102[t];
}
    total102 = soma102*1.50;

for(let r = 0; r<quantidade103.length; r++){
    soma103 += quantidade103[r];
}
    total103 = soma103*1.20;

for(let e = 0; e<quantidade104.length; e++){
    soma104 += quantidade104[e];
}
    total104 = soma104*1.30;

for(let w = 0; w<quantidade105.length; w++){
    soma105 += quantidade105[w];
}   
    total105 = soma105*1.00;

for(k=0; k<codigo.length; k++){
    if(quantidade100[k]>0){
        console.log(`Código 100 =-= quantidade: ${soma100} =-= total a pagar: R$:${total100.toFixed(2).replace('.',',')}`);
    }
    else if(quantidade101[k]>0){
        console.log(`Código 101 =-= quantidade: ${soma101} =-= total a pagar: R$:${total101.toFixed(2).replace('.',',')}`);
    }
    else if(quantidade102[k]>0){
        console.log(`Código 102 =-= quantidade: ${soma102} =-= total a pagar: R$:${total102.toFixed(2).replace('.',',')}`);
    }
    else if(quantidade103[k]>0){
        console.log(`Código 103 =-= quantidade: ${soma103} =-= total a pagar: R$:${total103.toFixed(2).replace('.',',')}`);
    }
    else if(quantidade104[k]>0){
        console.log(`Código 104 =-= quantidade: ${soma104} =-= total a pagar: R$:${total104.toFixed(2).replace('.',',')}`);
    }
    else if(quantidade105[k]>0){
        console.log(`Código 105 =-= quantidade: ${soma105} =-= total a pagar: R$:${total105.toFixed(2).replace('.',',')}`);
    }
}



// for(let u = 0; u<codigo.length; u++){
//     if (codigo[u]==100) {
//         console.log(`Código 100 =-= quantidade: ${soma100} =-= total a pagar: ${total100.toFixed(2)}`);
//     }
//     else if (codigo[u]==101) {
//         console.log(`Código 101 =-= quantidade: ${soma101} =-= total a pagar: ${total101.toFixed(2)}`);
//     }
//     else if (codigo[u]==102) {
//         console.log(`Código 102 =-= quantidade: ${soma102} =-= total a pagar: ${total102.toFixed(2)}`);
//     }
//     else if (codigo[u]==103) {
//         console.log(`Código 103 =-= quantidade: ${soma103} =-= total a pagar: ${total103.toFixed(2)}`);
//     }
//     else if (codigo[u]==104) {
//         console.log(`Código 104 =-= quantidade: ${soma104} =-= total a pagar: ${total104.toFixed(2)}`);
//     }
//     else if (codigo[u]==105) {
//         console.log(`Código 105 =-= quantidade: ${soma105} =-= total a pagar: ${total105.toFixed(2)}`);
//     }
//     else{
//         break;
//     }
// }


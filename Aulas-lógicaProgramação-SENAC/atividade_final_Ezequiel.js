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
let quantidade = [];
let quantidade100 = 0;
let quantidade101 = 0;
let quantidade102 = 0;
let quantidade103 = 0;
let quantidade104 = 0;
let quantidade105 = 0;

console.log('\nprodutos=-=-=-=--=-=-=código=-=-=-=preço\nCachorro-quente=-=-=-=-100=-=-=-=-R$:1,20\nBauru simples=-=-=-=-=-101=-=-=-=-R$:1,30\nBauru com ovo=-=-=-=-=-102=-=-=-=-R$:1,50\nHambúrguer=-=-=-=-=-=-=103=-=-=-=-R$:1,20\nCheeseburguer=-=-=-=-=-104=-=-=-=-R$:1,30\nRefrigerante=-=-=-=-=-=105=-=-=-=-R$:1,00');

do {
    codigo[i]=Number(prompt('Qual o código do pedido?'))
    if (codigo[i]>=100 && codigo[i]<=105 ) {
        quantidade[i]=Number(prompt('Qual a quantidade de itens?'))
        if (isNaN(quantidade[i])===false) {
            if (codigo[i]==100) {
                quantidade100+=quantidade[i]
            }
            else if (codigo[i]==101) {
                quantidade101+=quantidade[i]
            }
            else if (codigo[i]==102) {
                quantidade102+=quantidade[i]
            }
            else if (codigo[i]==103) {
                quantidade103+=quantidade[i]
            }
            else if (codigo[i]==104) {
                quantidade104+=quantidade[i]
            }
            else if (codigo[i]==105) {
                quantidade105+=quantidade[i]
            }
        }
        else{
            console.log('Valor inválido');
     }
    }
    else if(codigo[i]==999){
        break;
    }
    else{
        console.log('Código inválido');
        
    }
    
    i++
} while (i!=0); 

console.log('\n=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=');
console.log('\nprodutos=-=-=-=--=-=-=código=-=-=-=preço');
let total100 = 0;
let total101 = 0;
let total102 = 0;
let total103 = 0;
let total104 = 0;
let total105 = 0;
if (quantidade100>0) {
    total100 = quantidade100*1.20
    console.log('Cachorro-quente=-=-=-=-100=-=-=-=-R$:1,20\nQuantidade=-=-=-=-=-=-='+quantidade100+'=-=-=-=-=R$'+total100.toFixed(2).replace('.',','));
    console.log('\n=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=');
}
if (quantidade101>0) {
    total101 = quantidade101*1.30
    console.log('\nBauru simples=-=-=-=-101=-=-=-=-R$:1,30\nQuantidade=-=-=-=-=-='+quantidade101+'=-=-=-=-=R$'+total101.toFixed(2).replace('.',','));
    console.log('\n=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=');
}
if (quantidade102>0) {
    total102 = quantidade102*1.50
    console.log('\nBauru com ovo=-=-=-=-102=-=-=-=-R$:1,50\nQuantidade=-=-=-=-=-='+quantidade102+'=-=-=-=-=R$'+total102.toFixed(2).replace('.',','));
    console.log('\n=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=');
}
if (quantidade103>0) {
    total103 = quantidade103*1.20
    console.log('\nHamburguer=-=-=-=-103=-=-=-=-R$:1,20\nQuantidade=-=-=-=-'+quantidade103+'=-=-=-=-=R$'+total103.toFixed(2).replace('.',','));
    console.log('\n=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=');
}
if (quantidade104>0) {
    total104 = quantidade104*1.30
    console.log('\nCheeseburguer=-=-=-=-104=-=-=-=-R$:1,30\nQuantidade=-=-=-=-=-='+quantidade104+'=-=-=-=-=R$'+total104.toFixed(2).replace('.',','));
    console.log('\n=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=');
}
if (quantidade105>0) {
    total105 = quantidade105*1.00
    console.log('\nRefrigerante=-=-=-=-105=-=-=-=-R$:1,00\nQuantidade=-=-=-=-=-'+quantidade105+'=-=-=-=-=R$'+total105.toFixed(2).replace('.',','));
}

let totalFinal = total100 + total101 + total102 + total103 + total104 + total105;
console.log('\n=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=');
console.log('\nTotal=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=R$'+totalFinal.toFixed(2).replace('.',','));
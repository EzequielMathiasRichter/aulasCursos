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
let i=0;
let codigo = [];
let quantidade100 = 0;
let quantidade101 = 0;
let quantidade102 = 0;
let quantidade103 = 0;
let quantidade104 = 0;
let quantidade105 = 0;
let preco100 = 0;
let preco101 = 0;
let preco102 = 0;
let preco103 = 0;
let preco104 = 0;
let preco105 = 0;

console.log('\nprodutos=-=-=-=--=-=-=código=-=-=-=preço\nCachorro-quente=-=-=-=-100=-=-=-=-R$:1,20\nBauru simples=-=-=-=-=-101=-=-=-=-R$:1,30\nBauru com ovo=-=-=-=-=-102=-=-=-=-R$:1,50\nHambúrguer=-=-=-=-=-=-=103=-=-=-=-R$:1,20\nCheeseburguer=-=-=-=-=-104=-=-=-=-R$:1,30\nRefrigerante=-=-=-=-=-=105=-=-=-=-R$:1,00');
do {
    codigo[i] = Number(prompt('Qual o código do item que deseja comprar?'));
    if(codigo[i] == 999){
        break;
    }
    else if(codigo[i]==100){
        quantidade100 = Number(prompt('Qual a quantidade de itens senhor[a]?'));
        if(quantidade100==Number){
            preco100 = quantidade100 * 1.20;
        }
        else{
            console.log('Código inválido');
        }
    }
    else if(codigo[i]==101){
        quantidade101 = Number(prompt('Qual a quantidade de itens senhor[a]?'));
        if(quantidade101==Number()){
        preco101 = quantidade101 * 1.30;
        }
        else{
            console.log('Código inválido');
        }
    }
    else if(codigo[i]==102){
        quantidade102 = Number(prompt('Qual a quantidade de itens senhor[a]?'));
        if(quantidade102==Number()){    
        preco102 = quantidade102 * 1.50;
        }
        else{
            console.log('Código inválido');
        }
    }
    else if(codigo[i]==103){
        quantidade103 = Number(prompt('Qual a quantidade de itens senhor[a]?'));
        if(quantidade103==Number()){
        preco103 = quantidade103 * 1.20;
        }
        else{
            console.log('Código inválido');
        }
    }
    else if(codigo[i]==104){
        quantidade104 = Number(prompt('Qual a quantidade de itens senhor[a]?'));
        if(quantidade104==Number()){
        preco104 = quantidade104 * 1.30;
        }
    else{
        console.log('Código inválido');
    }
    }
    else if(codigo[i]==105){
        quantidade105 = Number(prompt('Qual a quantidade de itens senhor[a]?'));
       if(quantidade105==Number()){
        preco105 = quantidade105 * 1.00;
       }
       else{
        console.log('Código inválido');
       }
    }
    else{
        console.log('Código inválido');
    }
    i++
} while (i!=0);

let soma = preco100 + preco101 + preco102 + preco103 + preco104 + preco105;
if(quantidade100 > 0){
    console.log(`O código 100 foi solicitado ${quantidade100} vezes pelo valor de R$:1,20.`);
}
if(quantidade101 > 0){
    console.log(`O código 101 foi solicitado ${quantidade101} vezes pelo valor de R$:1,30.`);
}
if(quantidade102 > 0){
    console.log(`O código 102 foi solicitado ${quantidade102} vezes pelo valor de R$:1,50.`);
}
if(quantidade103 > 0){
    console.log(`O código 103 foi solicitado ${quantidade103} vezes pelo valor de R$:1,20.`);
}
if(quantidade104 > 0){
    console.log(`O código 104 foi solicitado ${quantidade104} vezes pelo valor de R$:1,30.`);
}
if(quantidade105 > 0){
    console.log(`O código 105 foi solicitado ${quantidade105} vezes pelo valor de R$:1,00.`);
}

console.log(`O total a pagar é igual a R$:${soma.toFixed(2).replace('.',',')}`);

 var prompt = require('prompt-sync')();
// let tabela = 1.99;
// let soma = 0
// let n = 
// console.log(`Tabela de preços do Sr. Manoel`);
// console.log(`=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-`);
// for(let i=1; i<50;i++){
//     soma = tabela*i
//     n = n+1
//     console.log(`${n} itens = R$:${soma}`);
//     console.log(`=-=-=-=-=-=-=-=-=-=-=-=-=`);
// }
// let produtos = []
// console.log(`Está é a nova loja do Sr. Manoel Joaquim, informe os valores dos itens e caso já tenha colocado todos os itens, digite 0 para encerrar o programa.`);
// console.log(`-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-`);
// let soma  = 0
// let i = 0
// while(produtos[i]!=0){
//     i++
//     produtos[i] = Number(prompt(`Produto ${i}: R$:`).replace(',','.'));
//     if(produtos[i] == 0){
//         break
//     }
//     soma+=produtos[i]
// }
// console.log(`O valor total é igual a: R$${soma}`);
// let dinheiro = prompt(`Informe o seu dinheiro:`)
// let troco = 0
// troco = dinheiro - soma
// console.log(`O seu troco é igual a: R$:${troco}`);
let valores = [];
for(let i=0;i<3;i++){
    valores[i] = Number(prompt(`Insira o ${i+1}° valor:`));
}
let A = valores[0];
let B = valores[1];
let C = valores[2];
if(A<B && A<C){
    //A é o menor
    if (B>A && B>C) {
        //B é o maior
        console.log(A,C,B);
    }
    else if (C>A && C>B) {
        //C é o maior
        console.log(A,B,C);
    }
    }

else if(B<A && B<C){
    //B é o menor
    if (C>B && C>A) {
        // C é o maior
        console.log(B,A,C);
    }
    else if(A>B && A>C){
    //A é o maior
    console.log(B,C,A);
}
    }

else if(C<A && C<B){
    //C é o menor
    if (A>B && A>C) {
        //A é o maior
        console.log(C,B,A);
    }
    else if (B>A && B>C) {
        //B é o maior
        console.log(C,A,B);
    }
}


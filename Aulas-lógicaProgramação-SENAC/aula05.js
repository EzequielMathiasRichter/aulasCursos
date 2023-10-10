// var A =[3,5,6,2,4,8,9,14];
// // cria uma lista dentro de uma variável A 
// var B = 0;
// // cria uma variável B
// for(let i = 0; i<A.length; i++){
// // cria uma laço de reptição for onde começa a contagem a partir do 0 e usa como
//     if(A[i]%2==0){
//         B+=A[i]
//     }
// }
// console.log(`A soma dos números pares é: ${B}`);
// var A =[3,5,6,2,4,8,9,14];
// var B = 0;
// for(let i = 0; i<A.length; i++){
//     if(A[i]%2!==0){
//         B+=A[i]
//     }
// }
// console.log(`A soma dos números ímpares é: ${B}`);


// let A =[3,5,6,2,4,8,9,14];
// let Maior = 0
// let Menor = 0
// for(let i = 0; i<A.length; i++){
//     if(A[i]>Maior){
//         Maior=A[i];
//     }
//         else if(A[i]>Maior){
//             Maior=A[i];
//         }                           
// }
// console.log(Maior);
// for(let i = 0; i<A.length; i++){
//     if(A[i]<Menor){
//         console.log(A[i]);
//     }
// }
    // if((A[0]+1)>10){
    //     console.log(A[0]);
    // }
    // else if((A[1]+1)>10){
    //     console.log(A[1]);
    // }
    // else if((A[2]+1)>10){
    //     console.log(A[2]);
    // }
    // else if((A[3]+1)>10){
    //     console.log(A[3]);
    // }
    // else if((A[4]+1)>10){
    //     console.log(A[4]);
    // }
    // else if((A[5]+1)>10){
    //     console.log(A[5]);
    // }
    // else if((A[6]+1)>10){
    //     console.log(A[6]);
    // }
    // else if((A[7]+1)>10){
    //     console.log(A[7]);
    // }






let A =[3,5,6,2,4,8,9,14];
// console.log('Maior:',Math.max(...A),'e está na posição',Math.max(A.length));
// console.log('Menor',Math.min(...A),'e está na posição',Math.min(...A));
let B = A[0]
let posicao = 0
let posicao2 = 0
for(let i=0; i<A.length; i++){
    if(A[i]>B){
        B=A[i]
        posicao = i
    }
}

console.log('Maior:',B, 'e está na posição:', posicao);

for(let i=0; i<A.length; i++){
    if(A[i]<B){
        B=A[i]
        posicao2 = i
    }
}
console.log('Menor:',B, 'e está na posição:',posicao2);


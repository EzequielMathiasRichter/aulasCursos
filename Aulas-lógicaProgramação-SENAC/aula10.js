/*
Em uma eleição presidencial existem 4 candidatos, João, José, Jamily e Jonathan.
Seus números de voto são: João = [1] José = [2] Jamily = [3] Jonathan = [4] nulo = [5] voto em branco = [6]
Caso o votante digite algum número que não está classificado acima deverá exibir uma mensagem dizendo erro.
para parar a votção deverá ser digitado a tecla [0]. 
*/
var prompt = require('prompt-sync')();

let votos = []

let i = 0;

console.log(`Bem-vindo a urna eletrônica mais fácil de ter os dados vazados do Brasil`);
console.log('=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-');
console.log('Segue abaixo a lista dos candidatos:⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇⬇');
console.log('=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-');
do{
    votos[i]=Number(prompt('lista:João=-=-=-=-=-=[1] José=-=-=-=-=-=[2] Jamily=-=-=-=-=[3] Jonathan=-=-=-=[4] Nulo=-=-=-=-=-=[5] Voto em branco=-=[6] Digite [0] para parar '));
    if (votos[i]==0){
        break;
    }
    i++
}while(i!=0);
let joao = 0;
let jose = 0;
let jamily = 0;
let jonathan = 0;
let nulos = 0;
let branco = 0;
let porcentagemNulos = 0;
let porcentagemN = 0;
let porcentagemBrancos = 0;
let porcentagemB = 0;
let total = 0;
for(let u = 0; u<votos.length;u++){
    if (votos[u]==1) {
        joao ++;
    }
 
    else if (votos[u]==2) {
        jose ++;
    }
    
    else if (votos[u]==3) {
        jamily++;
    }

    else if (votos[u]==4) {
        jonathan++;
    }
    
    else if (votos[u]==5) {
        nulos++; 
        
    }
    
    else if (votos[u]==6) {
        branco++;
    }
    else if (votos[u]!=5 && votos[u]!=6){
        total++
        porcentagemN = nulos *10;
        porcentagemNulos = porcentagemN/total;
        porcentagemB = branco*10;
        porcentagemBrancos = porcentagemB/total;
    }
}
console.log(`O total ed votos para João foi: ${joao}\nO total de votos para José foi: ${jose}\nO total de votos para Jamily foi: ${jamily}\nO total de votos para Jonathan foi: ${jonathan}\nO total de votos nulos foi: ${nulos}\nO total de votos em branco foi: ${branco}\nA porcentagem de votos nulos sobre o total de votos é: ${porcentagemNulos}% e a porcentagem de votos brancos sobre o total de votos é: ${porcentagemBrancos}% `);
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
  codigo[i] = Number(prompt('Qual o código do pedido?'));
  if (codigo[i] === 999) {
    break;
  }
  if(codigo[i]!=100 && codigo[i]!=101 && codigo[i]!=102 && codigo[i]!=103 && codigo[i]!=104 && codigo[i]!=105 && codigo[i]!=999){
    console.log('Código inválido');
  }

  if (codigo[i] === 100) {
    var quantidade = Number(prompt('Qual a quantidade de itens?'));
    quantidade100[i] = quantidade;
    if (isNaN(quantidade100[i])) {
      console.log('Valor inválido');
    }
  } else if (codigo[i] === 101) {
    var quantidade = Number(prompt('Qual a quantidade de itens?'));
    quantidade101[i] = quantidade;
    if (isNaN(quantidade101[i])) {
      console.log('Valor inválido');
    }
  } else if (codigo[i] === 102) {
    var quantidade = Number(prompt('Qual a quantidade de itens?'));
    quantidade102[i] = quantidade;
    if (isNaN(quantidade102[i])) {
      console.log('Valor inválido');
    }
  } else if (codigo[i] === 103) {
    var quantidade = Number(prompt('Qual a quantidade de itens?'));
    quantidade103[i] = quantidade;
    if (isNaN(quantidade103[i])) {
      console.log('Valor inválido');
    }
  } else if (codigo[i] === 104) {
    var quantidade = Number(prompt('Qual a quantidade de itens?'));
    quantidade104[i] = quantidade;
    if (isNaN(quantidade104[i])) {
      console.log('Valor inválido');
    }
  } else if (codigo[i] === 105) {
    var quantidade = Number(prompt('Qual a quantidade de itens?'));
    quantidade105[i] = quantidade;
    if (isNaN(quantidade105[i])) {
      console.log('Valor inválido');
    }
  }
  i++;
} while (i !== 0);

let total100 = 0;
let total101 = 0;
let total102 = 0;
let total103 = 0;
let total104 = 0;
let total105 = 0;

for (let o = 0; o < quantidade100.length; o++) {
  total100 += quantidade100[o] * 1.20;
}

for (let y = 0; y < quantidade101.length; y++) {
  total101 += quantidade101[y] * 1.30;
}

for (let t = 0; t < quantidade102.length; t++) {
  total102 += quantidade102[t] * 1.50;
}

for (let r = 0; r < quantidade103.length; r++) {
  total103 += quantidade103[r] * 1.20;
}

for (let e = 0; e < quantidade104.length; e++) {
  total104 += quantidade104[e] * 1.30;
}

for (let w = 0; w < quantidade105.length; w++) {
  total105 += quantidade105[w] * 1.00;
}

for (let k = 0; k < codigo.length; k++) {
  if (quantidade100[k] > 0) {
    console.log(`Código 100 =-= quantidade: ${quantidade100[k]} =-= total a pagar: R$ ${total100.toFixed(2).replace('.', ',')}`);
  } else if (quantidade101[k] > 0) {
    console.log(`Código 101 =-= quantidade: ${quantidade101[k]} =-= total a pagar: R$ ${total101.toFixed(2).replace('.', ',')}`);
  } else if (quantidade102[k] > 0) {
    console.log(`Código 102 =-= quantidade: ${quantidade102[k]} =-= total a pagar: R$ ${total102.toFixed(2).replace('.', ',')}`);
  } else if (quantidade103[k] > 0) {
    console.log(`Código 103 =-= quantidade: ${quantidade103[k]} =-= total a pagar: R$ ${total103.toFixed(2).replace('.', ',')}`);
  } else if (quantidade104[k] > 0) {
    console.log(`Código 104 =-= quantidade: ${quantidade104[k]} =-= total a pagar: R$ ${total104.toFixed(2).replace('.', ',')}`);
  } else if (quantidade105[k] > 0) {
    console.log(`Código 105 =-= quantidade: ${quantidade105[k]} =-= total a pagar: R$ ${total105.toFixed(2).replace('.', ',')}`);
  }
}

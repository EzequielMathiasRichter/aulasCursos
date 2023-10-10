// // const A = 3;
// // const B = 4;
// // const C = 5.2;
// // const triangulo = (A * C) / 2;
// // const pi = 3.14159;
// // const círculo = pi * (C ** 2);
// // const trapézio = (A + B) / 2 * C;
// // const quadrado = B ** 2;
// // const retangulo = A * B;

// // console.log(`á área do triângiulo retângulo com base igual a ${A} e altura igual a ${C} mede: ${triangulo.toFixed(2)} `);
// // console.log("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
// // console.log(`á área do círculo que tem o raio medindo ${C} é igual a: ${círculo.toFixed(2)}`);
// // console.log("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
// // console.log(`á área do trapézio que tem ${A} e ${B} como bases e ${C} como altura é igual a: ${trapézio.toFixed(2)}`);
// // console.log("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
// // console.log(`á área do quadrado quem tem lado igual a ${B} é igual a: ${quadrado.toFixed(2)}`);
// // console.log("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
// // console.log(`á área do retângulo com lados iguais a ${A} e ${B} é igual a: ${retangulo.toFixed(2)}`)

// const A = 3;

// if (A % 2 == 0) {
//     console.log("seu número é par");
// } else{
//     console.log("seu número é ímpar");
// }

// const peso = 80;
// const altura = 1.80;
// const imc = peso/(altura**2);
// if(imc<= 18.5){
// console.log(`sua classificação é magreza com o valor de ${imc.toFixed(1)}` );
// }
//     else if(imc >=18.5 && imc <=24.9){
//     console.log(`sua classificação é normal com o valor de ${imc.toFixed(1)}`);
// } 
//     else if(imc >=25 && imc <=29.9){
//     console.log(`sua classificação é sobrepeso com o valor de ${imc.toFixed(1)}`);
// } 
//     else if(imc>= 30 && imc <= 34.9){
//     console.log(`sua classificação é obesidade grau 1 com o valor de ${imc.toFixed(1)}`);
// } 
//     else if(imc>= 35 && imc <= 39.9){
//     console.log(`sua classificação é obesidade grau 2 com o valor de ${imc.toFixed(1)}`);
// } 
//     else if(imc>=40){
//     console.log(`sua classificação é obesidade grau 3 com o valor de ${imc.toFixed(1)}`);
// };

const salario = 2001
if (salario<=400){
    const A = salario*0.15
    const B = A + salario
    console.log(`seu novo sálario é ${B} com um aumento de 15% que vale ${A} `)
}
    else if(salario>=400.01 && salario<=800 ){
    const A = salario*0.12
    const B = A + salario
    console.log(`seu novo sálario é ${B} com um aumento de 12% que vale ${A} `)
}
else if(salario>=800.01 && salario<=1200 ){
    const A = salario*0.10
    const B = A + salario
    console.log(`seu novo sálario é ${B} com um aumento de 10% que vale ${A} `)
}
else if(salario>=1200.01 && salario<=2000 ){
    const A = salario*0.07
    const B = A + salario
    console.log(`seu novo sálario é ${B} com um aumento de 7% que vale ${A} `)
}
else if(salario>2000 ){
    const A = salario*0.04
    const B = A + salario
    console.log(`seu novo sálario é ${B} com um aumento de 4% que vale ${A} `)
}
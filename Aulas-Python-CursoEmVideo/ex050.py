peso = float(input('digite o seu peso: '))
altura = float(input('digite sua altura: '))
imc = peso / (altura * altura)
print('seu IMC é: {:.2f}'.format(imc))
if imc < 18.5:
    print('abaixo do peso ideal')
elif 18.5 < imc <= 25:
    print('peso ideal')
elif 25 < imc <= 30:
    print('sobrepeso')
elif 30 < imc <= 40:
    print('obesidade')
else:
    print('obesidade mórbida')

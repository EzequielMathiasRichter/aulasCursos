n = int(input('qual a distancia da sua viagem?'))
if 200 >= n:
    m = n * 0.5
    print('o valor total a sr pago é: R$:{:.2f}'.format(m))
if n > 200:
    b = n * 0.45
    print('o valor total a ser pago é de: R$:{:.2f}'.format(b))
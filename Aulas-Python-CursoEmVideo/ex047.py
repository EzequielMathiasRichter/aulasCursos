m = float(input('digite sua nota: '))
n = float(input('digite sua nota: '))
b = float(input('digite sua nota: '))
média = (m + n + b) / 3
if média < 5.0:
    print('sua média foi {:.1f}'.format(média))
    print('REPROVADO')
elif 5.0 <= média < 6.9:
    print('sua média foi {:.1f}'.format(média))
    print('RECUPERAÇÃO')
elif média >= 7.0:
    print('sua média foi {:.1f}'.format(média))
    print('APROVADO')

n = int(input('digite um número inteiro: '))
m = int(input('digite outro número inteiro: '))
if n > m:
    print('o primeiro valor é maior'.format(n, m))
elif n < m:
    print('o segundo valor é maior'.format(m, n))
else:
    print('não existe valor maior, os dois são iguais.')

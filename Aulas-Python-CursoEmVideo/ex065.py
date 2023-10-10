n = 'S'
par = impar = 0
while n == 'S':
    b = int(input('digite um valor: '))
    n = str(input('quer continuar? [S/N]')).upper()
print('fim')

'''n = 1
while n != 0:
    n = int(input('digite um valor: '))
    if n != 0:
        if n % 2 == 0:
            par += 1
        else:
            impar += 1
print('você digitou {} n° pares e {} n° impares'.format(par, impar))'''
r1 = float(input('digite o comprimento da primeira reta:'))
r2 = float(input('digite o comprimento da segunda reta:'))
r3 = float(input('digite o comprimento da terceira reta:'))
if r1 < r2 + r3 and r2 < r1 + r3 and r3 < r1 + r2:
    print('é um triângulo!')
    if r1 == r2 == r3:
        print('EQUILÁTERO')
    elif r1 != r2 != r3 and r1 != r3:
        print('ESCALENO')
    else:
        print('ISÓCELES')
else:
    print('os segmentos não podem formar um triângulo.')
n = float(input('digite o comprimento da primeira reta:'))
m = float(input('digite o comprimento da segunda reta:'))
b = float(input('digite o comprimento da terceira reta:'))
if (n + m > b) or (n + b > m) or (m + b > n):
    print('é um triângulo!')
elif (n == b) or (n == m) or (m == b):
    print('forma um triângulo isóceles!')
elif (n == m) or (n == b):
    print('forma um triângulo equilatero!')
else:
    print('escaleno')


import random
n = random.randint(0, 5)
num = int(input('O computador pensou em um número de 0 a 5. Se você acha que é capaz de adivinhar, digite o número aqui:'))
if num == n:
    print('parabéns, você acertou!')
else:
    print('que pena, você errou!')
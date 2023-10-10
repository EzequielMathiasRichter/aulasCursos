import random
from time import sleep
itens = ('pedra', 'papel', 'tesoura')
k = random.randint(0, 2)
print('suas jogadas: \n [0] PEDRA\n [1] PAPEL\n [2] TESOURA')
j = int(input('qual sua jogada?'))
print('JO')
sleep(0.5)
print('KEN')
sleep(0.5)
print('PÔ')
sleep(0.5)
print('-=' * 11)
print('o computador jogou {}'.format(itens[k]))
print('o jogador jogou {}'.format(itens[j]))
print('-=' * 11)

if k == 0:
    if j == 0:
        print('empate!')
    elif j == 1:
        print('o jogador ganhou!')
    elif j == 2:
        print('o computador ganhou!')
elif k == 1:
    if j == 0:
        print('o computador ganhou!')
    elif j == 1:
        print('empate!')
    elif j == 2:
        print('o joagador ganhou!')
elif k == 2:
    if j == 0:
        print('o jogador ganhou!')
    elif j == 1:
        print('o computador ganhou!')
    elif j == 2:
        print('empate!') 
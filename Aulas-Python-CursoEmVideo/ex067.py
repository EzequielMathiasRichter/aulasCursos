from random import randint
from time import sleep
pc = randint(0, 10)
print('Sou seu computador... Pensei em um número entre 0 e 10.')
sleep(0.7)
print('você acha que consegue adivinhar?')
sleep(0.7)
acertou = False
palpites = 0
while not acertou:
    jogador = int(input('Qual seu palpite?'))
    palpites += 1
    if jogador == pc:
        acertou = True
    else:
        if jogador > pc:
            print('Menos... Tente novamente')
        elif jogador < pc:
            print('Mais.. tente novamente:')
sleep(0.5)
print('processando...')
sleep(0.5)
print('...')
sleep(0.5)
print('você acertou com apenas {} tentativas!'.format(palpites))
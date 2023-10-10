frase = str(input('digite uma frase: ')).strip().upper()

n = frase.count('A')
m = frase.find('A')+1
b = frase.rfind('A')+1

print('a letra A aparece {} vezes e aparece pela prmiera vez na posição {} e a última vez na posição {}'.format(n, m, b))
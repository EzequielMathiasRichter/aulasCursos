
n = int(input('digite um número:'))
m = int(input('digite um número:'))
b = int(input('digite um número:'))
#maior = [n, m, b]
#print(max(maior))
if max([n, m, b]):
    print('o maior número é: {}'.format(max([n, m, b])))
if min([n, m, b]):
    print('o menor número é: {}'.format(min([n, m, b])))
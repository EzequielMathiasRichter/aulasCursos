
frase = int(input('digite um número entre 1 e 9999: '))
u = frase // 1 % 10
d = frase // 10 % 10
c = frase // 100 % 10
m = frase // 1000 % 10

print('analisando o número {} ......'.format(frase))
print('milhar: {}\ncentena: {}\ndezena: {}\nunidade: {} ' .format(m, c, d, u))
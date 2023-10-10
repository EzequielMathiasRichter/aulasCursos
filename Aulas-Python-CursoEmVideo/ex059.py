n = int(input('digite o primeiro termo de um PA: '))
m = int(input('digite a razão desta PA: '))
d = n + (10 - 1) * m
for c in range(n, d + m, m):
    print('{} '.format(c), end='→ ')
print('acabou!')
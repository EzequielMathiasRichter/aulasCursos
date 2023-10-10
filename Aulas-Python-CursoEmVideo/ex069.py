n = int(input('digite um número:'))
resultado = 1
i = 1
while i <= n:
    resultado *= i
    i += 1
print('o fatorial de {} é {}'.format(n, resultado))

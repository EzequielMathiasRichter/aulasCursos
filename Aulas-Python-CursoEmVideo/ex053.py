for c in range(6, 0, -1):
    print(c)
print('=-' * 5)
for c in range(0, 6, 2):
    print(c)
print('=-' * 5)
i = int(input('ínicio:'))
f = int(input('fim:'))
p = int(input('passo:'))
for c in range(i, f+1, p):
    print(c)
n = str(input('digite um palavra: ')).strip()
b = n.replace(' ', '')
r = b[::-1]
if r == b:
    print('é um palindromo')
else:
    print('não é um palindromo')
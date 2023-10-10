
nome = str(input('digite o nome de uma pessoa: ')).strip()
n = nome.split()

print('seu primeiro nome é: {}\nseu último nome é: {}'.format(n[0], n[len(n)-1]))

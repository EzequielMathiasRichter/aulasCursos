print('\033[31mOlá, mundo!\033[m')

a = 3
b = 5
print('os valores são \033[32m{}\033[m e \033[35m{}\033[m'.format(a, b))

nome = 'Ezequiel'

cores = {'limpa':'\033[m',
'azul':'\033[34m',
'amarelo' : '\033[33m',
'pretoebraco':'\033[7;30m'}

print('olá {}{}{}, muito prazer em te conhecer!!'.format(cores['azul'], nome, cores['limpa']))


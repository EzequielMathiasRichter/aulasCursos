nome = str(input('digite seu nome: ')).strip()

print('analisando seu texto...')
print('seu nome em letras maiusculas é: {}'.format(nome.upper()))
print('seu nome em letras minusculas é: {}'.format(nome.lower()))
print('o número de letras do seu nome é: {} '.format(len(nome)-nome.count(' ')))
#print('o seu primeiro nome tem {} letras'.format(nome.find(' ')))
   #mesma coisa que o de baixo
separa = nome.split()
print('Seu primeiro nome é {} e tem {} letras'.format(separa[0], len(separa[0])))
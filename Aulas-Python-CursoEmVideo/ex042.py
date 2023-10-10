nome = str(input('qual é seu nome?'))
if nome == 'Gustavo':
    print('que nome bonito')
elif nome == 'Pedro' or nome == 'Maria' or nome == 'Paulo':
    print('seu nome é bem popular no Brasil.')
else:
    print('seu nome é bem normal.')
print('tenha um bom dia {}'.format(nome))

frase = str(input('digite o seu nome: ')).strip()
palavra = 'SILVA'
if palavra in frase.upper():
    print('O nome tem ' + palavra)

if palavra not in frase.upper():
    print('O nome não tem ' + palavra)
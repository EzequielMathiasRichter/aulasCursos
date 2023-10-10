somaidade = 0
médiaidade = 0
maioridadeH = 0
nomevelho = ''
totmulher20 = 0
for p in range(1, 5):
    print('------ {}ª pessoa ------'.format(p))
    nome = str(input('nome: ')).strip()
    idade = int(input('idade: '))
    sexo = str(input('sexo [M/F]: ')).strip()
    somaidade += idade
    if p == 1 and sexo in 'Mm':
        maioridadeH = idade
        nomevelho = nome
    elif sexo in 'Mn' and idade > maioridadeH:
        maioridadeH = idade
        nomevelho = nome
    elif sexo in 'Ff' and idade < 20:
        totmulher20 += 1
médiaidade = somaidade / 4
print('a média idade do grupo é de {} anos'.format(médiaidade))
print('o homem mais velho tem {} anos e se chama {}. '.format(maioridadeH, nomevelho))
print('ao todo são {} mulheres com menos de 20 anos'.format(totmulher20))

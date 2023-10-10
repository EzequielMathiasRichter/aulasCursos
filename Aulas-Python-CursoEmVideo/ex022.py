from random import choice
n1 = str(input('o nome do primeiro aluno é: '))
n2 = str(input('o nome do segundo aluno é: '))
n3 = str(input('o nome do terceiro aluno é: '))
n4 = str(input('o nome do quarto aluno é: '))

lista = [n1, n2, n3, n4]

print(' O aluno escolhido foi: {}' .format(choice(lista)))

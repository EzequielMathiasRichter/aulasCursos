print('=-==-=-=-=-=-=- MERCADO RICHTER -=-=-=-=-=-=-=-=-=')
preço = float(input('digite o valor das compras: R$'))
print('''FORMAS DE PAGAMENTO 
[1] à vista dinheiro/cheque
[2] à vista no cartão
[3] 2x no cartão
[4] 3x ou mais no cartão''')
j = int(input('quala a forma de pagamento? '))
if j == 1:
    l = preço - (preço * (10 / 100))
    print('o valor a pagar é de R${:.2f}'.format(l))
elif j == 2:
    k = preço - (preço * (5 / 100))
    print('o valor a pagar é de R${:.2f}'.format(k))
elif j == 3:
    print('o valor fica igual')
elif j == 4:
    a = preço + (preço * (20 / 100))
    print('o valor fica de R${:.2f}'.format(a))

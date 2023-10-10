salário = float(input('este produto custa R$:'))
parcela = salário + (salário * 8 / 100)
avista =  salário - (salário * 15 / 100)
print ('o produto que você escolheu custa R$:{:.2f}, se você parcelar terá um aumento de 8%, ficando em R$:{:.2f}! \nAgora se você pagar a vista tera um desconto de 15%, ficando apenas R$:{:.2f}! ' .format(salário, parcela, avista))

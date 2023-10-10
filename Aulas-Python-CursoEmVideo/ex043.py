valor = float(input('qual o valor desta casa?'))
salário = float(input('qual seu salário?'))
anos = int(input('em quantos anos você vai querer pagar a casa?'))
parcela = valor / (anos * 12)
m = salário * (30/100)
if parcela <= m:
    print('parabéns, seu emprestimo foi aprovado e a parcela que devera pagr será de: R${:.2f}'.format(parcela))
elif parcela > m:
    print('seu emprestimo foi negado pois a parcela será maior que 30% do seu salário')

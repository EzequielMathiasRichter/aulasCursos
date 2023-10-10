n = float(input('digite seu salário:'))
if n <= 1250:
    m = (n*(15/100))+n
    print('seu novo salário é de: R$:{:.2f}'.format(m))
elif n > 1250:
    b = (n*(10/100))+n
    print('seu novo salário é de: R$:{:.2f}'.format(b))


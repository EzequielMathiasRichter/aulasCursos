from datetime import date
n = int(input('digite um ano qualquer? coloque 0 para analisar o ano atual:'))
if n == 0:
    n = date.today().year
if (n % 4) == 0 and n % 100!= 0 or n % 400 == 0:
    print('este ano é bissexto!')
else:
    print('este ano não é bissexto!')
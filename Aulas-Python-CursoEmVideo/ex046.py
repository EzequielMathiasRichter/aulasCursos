from datetime import date

ano = int(input('digite o ano que você nasceu: '))
n = date.today().year
m = n - ano
b = 18 - m
v = m - 18
if m < 18:
    print('este jovem ainda se alistara ao serviço militar. falta {} anos para você se alistar'.format(b))
elif m == 18:
    print('este é o ano de alistamento deste jovem.')
else:
    print('este jovem já passou pelo alistamento militar. Faz {} que ele se alistou ou deixou de se alistar'.format(v))

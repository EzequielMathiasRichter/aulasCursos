from datetime import date
idade = int(input('digite o ano de nascimento do atleta: '))
n = date.today().year
m = n - idade
if m <= 9:
    print('idade:{}'.format(m))
    print('\033[34mMIRIM\033[34m')
elif 9 < m <= 14:
    print('idade:{}'.format(m))
    print('classificação:\033[33mINFANTIL\033[m')
elif 14 < m <= 19:
    print('idade:{}'.format(m))
    print('classificação:\033[32mJUNIOR\033[m')
elif 19 < m <= 20:
    print('idade:{}'.format(m))
    print('classificação:\033[31mSÊNIOR\033[m')
else:
    print('idade:{}'.format(m))
    print('classificação:\033[35mMASTER\033[m')
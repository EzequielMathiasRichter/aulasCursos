n = float(input('qual a velocidade que você esatava andando na rodovia:'))
if n > 80:
    m = (n - 80)*7
    print('sua velocidade estava acima da permitida pela legislação, você receberá uma multa de: R$:{:.2f}'.format(m))
else:
    print('sua velocidade estava de acordo com a velocidade máxima constituida pela legislação.')
n1 = float(input('digite sua primeira nota:'))
n2 = float(input('digite sua segunda nota:'))
média = (n1 + n2)/2
print('sua média foi de: {:.1f}'.format(média))
if média >= 6.0:
    print('parabéns!')
else:
    print('estude mais!')
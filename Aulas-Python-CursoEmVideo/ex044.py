decimal = int(input('digite um número inteiro: '))
b = int(input('digite: \n(1) se quiser ele em binário\n(2) se quiser ele em octal e \n(3) se quiser ele em hexadecimal.\n '))
if b == 1:
    print('o número {}, convertido em binário se torna {}'.format(decimal, bin(decimal)[2:]))
elif b == 2:
    print('o número {}, convertido em octal se torna {}'.format(decimal, oct(decimal)[2:]))
elif b == 3:
    print('o número {} transformado em hexadecimal se torna {}'.format(decimal, hex(decimal)[2:]))
else:
    print('opção inválida.')
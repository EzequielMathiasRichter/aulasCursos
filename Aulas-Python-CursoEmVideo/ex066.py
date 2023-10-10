sexo = str(input('qual seu sexo? [F/M] ')).strip().upper()[0]
if sexo == 'M':
    print('seu sexo é masculino')
elif sexo == 'F':
    print('seu sexo é feminino')
while sexo not in 'MmFf':
    sexo = str(input('dados inválidos, informe seu sexo novamente: ')).strip().upper()[0]
    if sexo == 'M':
        print('seu sexo é masculino')
    elif sexo == 'F':
        print('seu sexo é feminino')
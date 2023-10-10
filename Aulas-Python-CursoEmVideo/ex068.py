# Inicialmente, lemos os dois números informados pelo usuário
numero1 = float(input("Digite o primeiro número: "))
numero2 = float(input("Digite o segundo número: "))

# Definimos a variável "opcao" como zero para entrar no loop abaixo
opcao = 0

while opcao != 5:
    # Exibimos o menu de opções
    print("Escolha uma opção:")
    print("1 - Somar os números")
    print("2 - Multiplicar os números")
    print("3 - Verificar qual é maior")
    print("4 - Escolher novos números")
    print("5 - Sair")

    # Leitura da opção escolhida pelo usuário
    opcao = int(input("Opção escolhida: "))

    # Realizamos a operação correspondente a opção escolhida
    if opcao == 1:
        resultado = numero1 + numero2
        print("O resultado da soma é:", resultado)
        break
    elif opcao == 2:
        resultado = numero1 * numero2
        print("O resultado da multiplicação é:", resultado)
        break
    elif opcao == 3:
        if numero1 > numero2:
            print("O primeiro número é maior")
            break
        elif numero2 > numero1:
            print("O segundo número é maior")
            break
        else:
            print("Os números são iguais")
            break
    elif opcao == 4:
        numero1 = float(input("Digite o novo primeiro número: "))
        numero2 = float(input("Digite o novo segundo número: "))
    elif opcao == 5:
        print("Saindo...")
    else:
        print("Opção inválida!")
primeiro_termo = int(input("Digite o primeiro termo da progressão: "))
razao = int(input("Digite a razão da progressão: "))

termo_atual = primeiro_termo
contador = 1

while contador <= 10:
    print(termo_atual)
    termo_atual += razao
    contador += 1
primeiro_termo = int(input("Digite o primeiro termo da progressão: "))
razao = int(input("Digite a razão da progressão: "))
num_termos = int(input("Digite o número de termos da progressão: "))

termo_atual = primeiro_termo
contador = 1

while contador <= num_termos:
    print(termo_atual)
    termo_atual += razao
    contador += 1
   
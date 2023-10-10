n = int(input("Digite o número de termos que deseja gerar na sequência de Fibonacci: "))

# inicializando as duas primeiras posições
termo_atual = 0
proximo_termo = 1

contador = 0

# verificando se o número de termos é válido
if n <= 0:
   print("Digite um número positivo.")
elif n == 1:
   print("Sequência de Fibonacci até", n, ":")
   print(termo_atual)
else:
   print("Sequência de Fibonacci:")
   while contador < n:
       print(termo_atual)
       proximo = termo_atual + proximo_termo
       # atualizando os valores dos termos
       termo_atual = proximo_termo
       proximo_termo = proximo
       contador += 1
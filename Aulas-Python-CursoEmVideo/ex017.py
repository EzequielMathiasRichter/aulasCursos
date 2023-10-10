#  Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
#  Calcule o preço a pagar, sabendo que o carro custa R$60 por dia e R$0,15 por Km rodado.
c = float(input('por quantos dias você alugou este carro?'))
k = float(input('quantos km este carro percorreu?'))
d = ( 60 * c ) + ( 0.15 * k )
print('o total a pagar será R$:{:.2f}' .format(d))

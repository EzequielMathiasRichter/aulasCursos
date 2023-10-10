l = float(input('qual a largura da parede? Em metros'))
c = float(input('qual o comprimento da parede? Em metros'))
área = l * c
litros = área / 2
print('uma parede com largura de {} metros e comprimento  de {} metros, ocupa uma área de {} m². \nSerão utilizados {}L de tinta para pinta-lá. Usando com base que cada litro de tinta pinta 2m².' .format(l, c, área, litros))

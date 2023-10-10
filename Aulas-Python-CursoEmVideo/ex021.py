import math
from math import cos, sin, tan, radians

n = float(input('indique o ângulo: '))

s = sin(radians(n))
d = cos(radians(n))
f = tan(radians(n))


print('o seno do ângulo {} é {:.8f}, o cosseno é {:.8f} e a tangente é {:.8f}' .format(n, s, d, f))

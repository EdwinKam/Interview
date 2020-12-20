import random

outside =0
inside=0

for i in range (99999):
  x = random.random()
  y = random.random()
  #print(x)
  x=x*x
  y=y*y
  rt = (x+y)**(1/2)
  #print(rt)
  #print(2**(1/2))
  if rt > 1:
    outside+=1
  else:
    inside+=1
print(inside)
print(outside)
area=4*(inside)/(inside+outside)
print((area))

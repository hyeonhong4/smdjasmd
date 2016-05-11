day=0
A=0
B=0
def Set(A,B):
      while True:
            try:
                  Q=int(input("당신의 생일은 SET",A,"에 있습니까?1(=Y)/2(=N)"))

                  if Q==1:
                        day=day+B
                        break
                  elif Q==2:
                        break
                  else:
                        print("다시 입력해주세요")
            except:
                  print("1/2중 하나를 써주세요")
print("---SET1---")
print(1,3,5,7)
print(9,11,13,15)
print(17,19,21,23)
print(25,27,29,31)

Set(1,1)

print("---SET2---")
print(2,3,6,7)
print(10,11,14,15)
print(18,19,22,23)
print(26,27,30,31)
while True:
      try:
            Q2=int(input("당신의 생일은 SET1에 있습니까?1(=Y)/2(=N)"))
            if Q2==1:
                  day=day+2
                  break
            elif Q2==2:
                  break
            else:
                  print("다시 입력해주세요")
      except:
            print("1/2중 하나를 써주세요")
print("---SET3---")
print(4,5,6,7)
print(12,13,14,15)
print(20,21,22,23)
print(28,29,30,31)
while True:
      try:
            Q3=int(input("당신의 생일은 SET1에 있습니까?1(=Y)/2(=N)"))
            if Q3==1:
                  day=day+4
                  break
            elif Q3==2:
                  break
            else:
                  print("다시 입력해주세요")
      except:
            print("1/2중 하나를 써주세요")

print("---SET4---")
print(8,9,10,11)
print(12,13,14,15)
print(24,25,26,27)
print(28,29,30,31)
while True:
      try:
            Q4=int(input("당신의 생일은 SET1에 있습니까?1(=Y)/2(=N)"))
            if Q4==1:
                  day=day+8
                  break
            elif Q4==2:
                  break
            else:
                  print("다시 입력해주세요")
      except:
            print("1/2중 하나를 써주세요")

print("---SET5---")
print(16,17,18,19)
print(20,21,22,23)
print(24,25,26,27)
print(28,29,30,31)
while True:
      try:
            Q5=int(input("당신의 생일은 SET1에 있습니까?1(=Y)/2(=N)"))
            if Q5==1:
                  day=day+16
                  break
            elif Q5==2:
                  break
            else:
                  print("다시 입력해주세요")
      except:
            print("1/2중 하나를 써주세요")

print("당신의 생일은",day,"입니다.")



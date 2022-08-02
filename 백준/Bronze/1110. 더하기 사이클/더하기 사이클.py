count = 0
a = int(input())
b = a
while True:
    a1 = a//10
    a2 = a%10
    a = a2*10+(a1+a2)%10
    count+=1
    if b==a:
        break
    
print(count)
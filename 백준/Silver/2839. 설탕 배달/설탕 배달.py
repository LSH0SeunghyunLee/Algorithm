n=int(input())
for i in reversed(range((n//5)+1)):
    if (n-5*i)%3 == 0:
        a = i
        b = (n-5*i)//3
        print(a+b)
        break
    else:
        if i == 0:
            print(-1)
            break
        else:
            continue
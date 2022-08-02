H,M=map(int,input().split())

if M - 45 >= 0:
    M=M-45
else:
    if H==0:
        H=23
        M=M+15
    else:
        H=H-1
        M=M+15
print(H,M)
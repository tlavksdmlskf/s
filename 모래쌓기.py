import random

red = '\033[31m \033[41m' + '■' + '\033[0m'
blue = '\033[34m \033[44m' + '■' + '\033[0m'
yellow = '\033[33m \033[43m' + '■' + '\033[0m'
green = '\033[32m \033[42m' + '■' + '\033[0m'
pink = '\033[35m \033[45m' + '■' + '\033[0m'
null = '\033[30m \033[40m' + '■' + '\033[0m'

a_list, b_list, c_list, d_list, e_list, f_list, g_list = [], [], [], [], [], [], [] 

str_list = [red, blue, yellow, green, pink] 

lis_list = [a_list, b_list, c_list, d_list, e_list, f_list, g_list] 


for i in str_list:
    for j in range(4):
        lis_list[random.randrange(len(lis_list))].append(i) 

if len(lis_list[len(lis_list)-1]) > 4: 

    for j in range(len(lis_list[len(lis_list)-1])-4):
        lis_list[0].append(lis_list[len(lis_list)-1].pop())

for i in range(1, len(lis_list)):   

    if len(lis_list[i-1]) > 4:
        for j in range(len(lis_list[i-1])-4):
            lis_list[i].append(lis_list[i-1].pop())    

while True:
    f=0

    for i in lis_list:
        for j in range(4-len(i)):
            i.append(null)

    for i in range(3, -1, -1):
        for j in range(len(lis_list)):
            print(lis_list[j][i],end=" ")
        print()

    for i in range(len(lis_list)):  
        if lis_list[i].count(lis_list[i][0])==4:   
            f+=1

    if f == 7:  
        break

    for i in range(len(lis_list)):
        for j in range(len(lis_list[i])):
            if null in lis_list[i]:
                lis_list[i].pop()

    X = int(input("어디에서?(포기하실려면 '77'을 입력해주세요)"))-1
    if X == 76:
        print("다음에 또 도전해보세요.")
        exit()
    Y = int(input("어디로?"))-1

    if (X > len(lis_list)-1 or Y > len(lis_list)-1 or X < 0 or Y < 0 or len(lis_list[X]) == 0): 
        print("다시 입력해주세요.")
        continue


    if len(lis_list[Y]) == 4:   
        print("이동을 시도할려는 병이 꽉 차있어서 이동 할 수 없습니다")

    elif len(lis_list[Y]) == 0 or lis_list[X][len(lis_list[X])-1] == lis_list[Y][len(lis_list[Y])-1]: 
        lis_list[Y].append(lis_list[X].pop())

    else:
        print("움직일 수 없습니다")

    print("---------------------------------------------")

print("게임을 클리어하셨군요. 축하드립니다!")
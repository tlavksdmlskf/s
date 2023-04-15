a=int(input("score: "))
if a>100 or a<=0:
    print("잘못된 점수입니다")
elif a>80:
    print("grade is A")
elif a>60:
    print("grade is B")
elif a>40:
    print("grade is C")
elif a>20:
    print("grade is D")
elif a>=0:
    print("grade is E")


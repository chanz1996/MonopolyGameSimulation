f = open("Monopoly.java", "r")
t=open("a.txt","w")
lines = f.readlines()

for i in range(len(lines)-1,-1,-1) :
    lines[i] = lines[i].strip()
    print(lines[i])

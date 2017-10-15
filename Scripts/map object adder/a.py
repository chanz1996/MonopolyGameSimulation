f = open("New Text Document.txt", "r")

lines = f.readlines()
no=1;

for i in lines :
    i=i.strip()
    print("b.put(\"",i,"\",place",no,");",sep='')
    no +=1

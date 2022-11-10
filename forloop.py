multiple=int(input("which numbers multiplication table you need :"))
lines=int(input("to how much yoy need the table of"+str(multiple)+':'))
for x in range(1,lines+1):
    print(str(x)+'x'+str(multiple)+'='+str(multiple*x))
#print(files)
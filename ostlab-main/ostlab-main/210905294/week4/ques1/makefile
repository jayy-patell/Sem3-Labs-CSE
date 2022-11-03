final: mainprg.o push.o pop.o
	gcc -o m1 mainprg.o push.o pop.o
	
mainprg.o: mainprg.c func.h
	gcc -c mainprg.c
	
push.o: push.c func.h
	gcc -c push.c
	
pop.o: pop.c func.h
	gcc -c pop.c


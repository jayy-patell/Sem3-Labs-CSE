final: mainprg.o add.o sub.o
	gcc -o m1 mainprg.o add.o sub.o
	
mainprg.o: mainprg.c maths.h
	gcc -c mainprg.c
	
add.o: add.c maths.h
	gcc -c add.c
	
sub.o: sub.c maths.h
	gcc -c sub.c


#include<stdio.h>
#include "func.h"

extern int top;
extern int arr[];

int pop(){
	if(top == -1){
		printf("Stack underflow");
		return -1;
	}else{
		return arr[top--];
	}
}

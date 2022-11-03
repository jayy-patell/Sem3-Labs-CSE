#include<stdio.h>
#include "func.h"

extern int arr[];
extern int top;

void push(int val){
	if(10-top<1){
		printf("Stack overflow");
	}else{
		top++;
		arr[top]=val;
	}
}

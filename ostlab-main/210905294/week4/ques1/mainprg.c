#include<stdio.h>
#include "func.h"
int arr[10];
int top=-1;
int main(){
	int input,val;
	do{
		printf("0:Exit\n");
		printf("1:Push\n");
		printf("2:Pull\n");
		printf("what do you wanna do?");
		scanf("%d", &input);
		switch(input){
			case 0: break;
			case 1: 
			{
			printf("Enter element to push: ");
			scanf("%d", &val);
			printf("Pushing..\n");
			push(val);
			break;
			}
			case 2: 
			{
			printf("Popping..\n");
			pop();
			break;
			}
		}
	}while(input!=0);
	for(int i=0;i<10;i++){
		printf("%d  ", arr[i]);
	}
	return 0;
}

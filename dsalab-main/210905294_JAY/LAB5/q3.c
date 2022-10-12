// #include<stdio.h>
// #include<string.h>

// char *stack;
// int top = -1;

// void push(char ele){
//     stack[++top]=ele;
// }
// int pop(){
//     return stack[top--];
// }
// int isPalin(char str[]){
//     int i;
//     int n = strlen(str);
//     int mid=n/2;
//     stack = (char*)malloc(n*sizeof(char)); 
//     for(i=0;i<=mid;i++){
//         push(stack[i]);
//     }
//     if(n%2!=0){
//         i++;
//     }

//     while(str[i]!='\0'){
//         char val = pop();
//         if(str[i]!=val){
//             return 0;
//         }
//         i++;
//     }

//     return 1;

// }

// int main(){
//     int n;
//     char* str;
//     printf("Enter a string: ");
//     scanf("%s", str);
//     if(isPalin(str)){
//         printf("Yes.");
//     }else{
//         printf("NO.");
//     }
//     return 0;
// }

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct {
    char *st;
    int tos;
} Stack;

Stack push(Stack s, char x) {
    s.tos += 1;
    s.st[s.tos] = x;
    return s;
}

int main() {
    char str[100];

    printf("Enter a word ");
    scanf("%s",str);

    Stack s;
    s.st = (char *) malloc(strlen(str)*sizeof(char));
    s.tos = -1;

    int i;

    for(i = strlen(str)-1;i>=0;i--)
        s = push(s,str[i]);
    if (strcmp(s.st,str) == 0)
        printf("The word is a palindrome");

    else
        printf("The word is not a palindrome");
}
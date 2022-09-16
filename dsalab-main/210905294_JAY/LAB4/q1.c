#include<stdio.h>
#include<stdlib.h>

int Fib(int n){
    //base case
    if(n <= 1)
        return n;

    return Fib(n-1) + Fib(n-2);
}

int main(){
    int n;
    printf("Enter No. of Fibonacci number you want: ");
    scanf("%d",&n);
    for(int i=0;i<=n;i++){
        printf("%d  ", Fib(i));
    }
    return 0;
}

//without using recursion

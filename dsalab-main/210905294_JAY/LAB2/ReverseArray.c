#include<stdio.h>

int main(){
    int n,i, *p,*q,t;
    printf("Enter size of array: ");
    scanf("%d", &n);
    int a[n];
    printf("Enter elemetns: ");
    for(i=0;i<n;i++){
        scanf("%d", &a[i]);
    }
    printf("Entered array is: ");
    for(i=0;i<n;i++){
        printf("%d\t", a[i]);
    }

    p=&a[0];
    q=&a[n-1];

    for(i=0;i<n/2;i++){
        t=*(p+i);
        *(p+i)=*(q-i);
        *(q-i)=t;
    }

    printf("After reversing: ");
    for(i=0;i<n;i++){
        printf("%d\t", a[i]);
    }

    return 0;
}

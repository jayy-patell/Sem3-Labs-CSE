#include<stdio.h>

int Add(int a[], int n){
    int sum=0;
    int i;
    for(i=0;i<n;i++){
        sum+=a[i];
    }
    return sum;
}

int main(){
    int i, n, sum;
    printf("Enter size of array: ");
    scanf("%d", &n);
    int a[n];
    printf("Enter elements: ");
    for(i=0;i<n;i++){
        scanf("%d", &a[i]);
    }

    sum=Add(a,n);
    printf("The total is: %d", sum);

    return 0;
}

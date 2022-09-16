#include<stdio.h>
#include<stdlib.h>

void Lsearch(int a[], int n){
    int i;
    for(i=0;i<n;i++){
        if(n==a[i]){
            printf("Element is present in the array.");
        }else{
            printf("Element not present");
        }
    }
}

int main(){
    int n, a[10], m, i;
    printf("Enter size of array: ");
    scanf("%d", &n);
    printf("Enter array is: ");
    for(i=0;i<n;i++){
        scanf("%d", &a[i]);
    }
    printf("Enter element to be searched: ");
    scanf("%d", &m);

    Lsearch(a,m);

    return 0;
}


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


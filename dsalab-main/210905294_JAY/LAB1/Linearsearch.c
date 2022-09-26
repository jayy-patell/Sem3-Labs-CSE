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

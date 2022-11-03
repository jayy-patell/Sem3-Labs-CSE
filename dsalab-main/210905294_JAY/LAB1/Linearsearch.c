#include<stdio.h>
#include<stdlib.h>

void Lsearch(int a[], int m,int n){
    int i;
    int flag=0;
    // int n= a.length;
    for(i=0;i<n;i++){
        if(m==a[i]){
            flag=1;
        }
    }
    if(flag==1){
         printf("Element is present in the array.");
    }else{
          printf("Element not present");
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

    Lsearch(a,m,n);

    return 0;
}

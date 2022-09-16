#include<stdio.h>
#include<stdlib.h>

int smallest(int n){
    int i,small;
    int* a = (int*)malloc(n*sizeof(int));
    printf("Enter elements: ");
    for(i=0;i<n;i++){
        scanf("%d", (a+i));
    }

    small = *a;
    for(i=0;i<n;i++){
        if(*(a+i)>*(a+i+1))
            small=*(a+i+1);
    }
    return small;
}
int main(){
    int i,n;
    printf("Enter size of array: ");
    scanf("%d", &n);
    
    int small=smallest(n);
    printf("Smallest is: %d", small);
    return 0;
}

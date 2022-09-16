#include<stdio.h>

int main(){
    int a[10], n,i,lrg=0,lrg2=0;
    printf("Enter size of array: ");
    scanf("%d", &n);
    printf("Enter elemetns: ");
    for(i=0;i<n;i++){
        scanf("%d", &a[i]);
    }

    for(i=0;i<n;i++){
        if(lrg<a[i]){
            lrg=a[i];
            lrg2=lrg;
        } else
        if(a[i] > lrg2 && a[i] != lrg){
            lrg2=a[i];
        }
    }

    if (lrg2 == lrg)
        printf("There is no second largest element\n");
    else
        printf("\nThe Second largest element in the array is: %d", lrg2);

    return 0;
}


/*
#include <stdio.h>

int main(void) {
    int x[10];
    int i, n;
    int first = x[0];
    int second = x[0];

    printf("Input the size of array :");
    scanf("%d", &n);

    printf("Input %d elements in the array :\n", n);
    for (i = 0; i < n; i++) {
        printf("x[%d]: ", i);
        scanf("%d", &x[i]);
    }

    for (i = 0; i < n; ++i) {
        if (first < x[i]) {
            second = first;
            first = x[i];
        } else
        if (x[i] > second && x[i] != first) {
            second = x[i];
        }
    }

    if (second == first)
        printf("There is no second largest element\n");
    else
        printf("\nThe Second largest element in the array is: %d", second);

    return 0;
}
*/

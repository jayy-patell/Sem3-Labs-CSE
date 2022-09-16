#include<stdio.h>
#include<stdlib.h>

void reverse(int *p, int n)
{
    int *b, *l, *mid;
    l=(p+n);
    mid = p+(l-p)/2;
    l=l-1;
    for(b=p;b<=mid;b++,l--)
    {
        int t;
        t=*b;
        *b=*l;
        *l=t;
    }
}
int main()
{
    int *a,i;
    a=(int*)calloc(6,sizeof(int));
    int n=6;
    printf("Enter the elements in an array");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    reverse(a,n);
    printf("The reversed array is:....");
    for(i=0;i<n;i++)
    {
        printf("%d",a[i]);
    }

    return 0;
}

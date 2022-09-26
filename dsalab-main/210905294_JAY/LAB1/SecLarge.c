#include <stdio.h>

void secLarge(int a[], int n){
	int i,lrg=0,lrg2=0;
	for(i=0;i<n;i++){
		if(lrg<a[i]){
			lrg2=lrg;
			lrg=a[i];
		}
		
		else if (a[i] > lrg2 && a[i] != lrg) {
            lrg2 = a[i];
		}
	}
	if(lrg==lrg2){
		printf("There is no second largest number.");
	}else{
		printf("The second largest number in the array is: %d", lrg2);
	}
}

int main()
{
	int a[10],n,i;
	printf("Enter size of array: ");
	scanf("%d", &n);
	if(n<2 || n>10){
		printf("Invalid input.");
	}
	printf("Enter elements: ");
	for(i=0;i<n;i++){
		scanf("%d", &a[i]);
	}
	secLarge(a,n);
	
	return 0;
}

import java.util.Scanner;

class Bubble
{
	static void sort(int array[], int arr[])
	{
		Scanner sc = new Scanner(System.in);
		int n = array.length;
		int temp = 0,i,j;
		for(i=0;i<n-1;i++){
			for(j=0;j<(n-i-1);j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println("Ascending Order: ");
		for(i=0;i<n;i++){
			System.out.println(array[i]+"\t");
		}

		
		for(i=0;i<n-1;i++){
			for(j=0;j<(n-i-1);j++){
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Descending Order: ");
		for(i=0;i<n;i++){
			System.out.println(arr[i]+"\t");
		}

		sc.close();
	}


	public static void main(String args[])
	{
	int i,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter strength of array: ");
	n=sc.nextInt();

	int[] array = new int[n];
	int[] arr = new int[n];
	int x = array.length;
	System.out.println("Enter elements: ");
	for(i=0;i<x;i++){
		array[i]=sc.nextInt();
	}
	for(i=0;i<x;i++){
		arr[i]=array[i];
	}

	System.out.println("Entered array is:");
	for(i=0;i<x;i++){
		System.out.println(array[i]+"\t");
	}

	System.out.println("After sorting: ");
	sort(array,arr);

	sc.close();
	}
}
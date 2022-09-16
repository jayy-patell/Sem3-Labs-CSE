import java.util.Scanner;

class InsDel
{
	static void insert(int array[],int r)
	{
		int i,ele,pos;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[r+1];                //making new array of size+1 so we could insert ele without out of bounds error
		// int len=arr.length;

		System.out.println("Enter element to be inserted: ");
		ele=sc.nextInt();
		System.out.println("Enter position to be inserted: ");
		pos=sc.nextInt();
		for(i=r;i>=pos;i--){
			arr[i]=array[i-1];
		}
		arr[pos-1]=ele;
		
		for(i=0;i<pos-1;i++){
			arr[i]=array[i];
		}

		System.out.println("After inserting: ");
		for(i=0;i<r+1;i++){
			System.out.println(arr[i]);
		}
	}

	static void delete(int array[])
	{
		int pos,i;
		Scanner sc = new Scanner(System.in);
		int n=array.length;
		System.out.println("Enter position to be deleted: ");
		pos=sc.nextInt();
		for(i=pos-1;i<n-1;i++){
			array[i]=array[i+1];
		}
		System.out.println("After deleting: ");
		for(i=0;i<n-1;i++){
			System.out.println(array[i]);
		}
	}

	public static void main(String args[])
	{
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strength of array: ");
		n=sc.nextInt();

		int[] array = new int[n];
		int x = array.length;
		System.out.println("Enter elements: ");
		for(i=0;i<x;i++){
			array[i]=sc.nextInt();
		}

		System.out.println("Entered array is: ");
		for(i=0;i<x;i++){
			System.out.println(array[i] + "\t");
		}

		insert(array,n);
		delete(array);
	}
}

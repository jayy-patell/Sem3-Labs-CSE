import java.util.Scanner;

class LSearch
{
	static boolean search(int array[],int key)
	{
		int i;
		int n=array.length;
		for(i=0;i<n;i++)
		{
			if(array[i]==key){
				return true;
			}	
		}
		return false;
	}

	public static void main(String args[])
	{
		int i,n,key;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strength of array: ");
		n=sc.nextInt();

		int[] array = new int[n];
		int x = array.length;
		System.out.println("Enter elements: ");
		for(i=0;i<x;i++){
			array[i]=sc.nextInt();
		}

		System.out.println("Enter numer to be searched: ");
		key=sc.nextInt();

		if(search(array, key)==true){
			System.out.println("Found!");
		}else{
			System.out.println("Not found.");
		}
	}
}
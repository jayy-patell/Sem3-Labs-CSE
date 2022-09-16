import java.util.Scanner;

class Largest
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int large = largest(a,b,c);
		System.out.println("The largest number is: "+large);
	}

	static int largest(int a, int b, int c)
	{
		int found=0;
		if(a>b){
			if(a>c){
				found=a;
			}
		}else if(c>b){
			if(c>a)
				found=c;
		}else{
			found=b;
		}
		return found;
	}
}
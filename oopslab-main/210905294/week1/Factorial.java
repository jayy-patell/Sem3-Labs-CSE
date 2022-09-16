import java.util.Scanner;

class Factorial
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = sc.nextInt();

		int ans = fact(n);
		System.out.println("Factoial of the entered number is: "+ans);
		int ncr = combinators();
		System.out.println("NCR is: "+ncr);
	}

	static int fact(int n)
	{
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans = ans*i;
		}
		return ans;
	}
	static int combinators()
	{
		int num=0,r,answer=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n and r: ");
		num = sc.nextInt();
		r = sc.nextInt();
		answer = fact(num) / (fact(num-r)*fact(r));
		return answer;
	}
}
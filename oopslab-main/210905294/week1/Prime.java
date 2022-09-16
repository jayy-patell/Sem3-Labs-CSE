import java.util.Scanner;

class Prime
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if prime or not: ");
		n = sc.nextInt();
		for(int i=1;i<n;i++){
			if(isPrime(i)){
				System.out.println(i);
			}else{
				System.out.println("Its not a prime number.");
				break;
			}
		}
	}

	static boolean isPrime(int n){
		int i=0,prime=0;
		if(n==0 || n==1){
			return false;
		}
		for(i=2;i<=n;i++){
			prime=0;
			if(n%i==0){
				prime=1;
				break;
			}
		}
		if(prime==0){
			return true;
		}else{
			return false;
		}
	}
}
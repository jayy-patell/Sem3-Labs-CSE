import java.util.Scanner;

class Roots
{
	public static void main(String args[])
	{
		int a,b,c,n=0;
		double x1,x2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers a b c: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int disc = (b*b)-(4*a*c);
		if(disc > 0){
			n=0;
		}else if(disc < 0){
			n=1;
		}else if(disc == 0){
			n=2;
		}

		switch(n){
			case(0): {
				x1= -b-(Math.sqrt(disc))/(2*a);
				x2= -b+(Math.sqrt(disc))/(2*a);
				System.out.println("The roots are real and distinct: "+x1+"\t"+x2);
				break;
			}
			case(1): {
				System.out.println("Roots are imaginary");
				break;
			}
			case(2): {
				x1=(-b/2*a);
				System.out.println("Roots are real and equal: "+x1+x1);
				break;
			}
		}
	}
}
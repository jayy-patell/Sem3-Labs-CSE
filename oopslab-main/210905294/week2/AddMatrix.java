import java.util.Scanner;

class AddMatrix
{
	static void add(int mat1[][], int mat2[][],int m,int n)
	{

	int i,j;
	Scanner sc = new Scanner(System.in);
	int[][] sum = new int[m][n];
	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			sum[i][j] = mat1[i][j]+mat2[i][j];
		}
	}
	System.out.println("Resulting matrix is: ");
	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			System.out.println(sum[i][j]+"\t");
		}
		System.out.println("\n");
	}

	}

	public static void main(String args[])
	{
		int i,j,m,n,p,q;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and columns of mat1:");
		m=sc.nextInt();
		n=sc.nextInt();
		int[][] mat1 = new int[m][n];
		System.out.println("Enter elements of mat1: ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				mat1[i][j]=sc.nextInt();
			}
		}


		System.out.println("Enter rows and columns of mat2:");
		p=sc.nextInt();
		q=sc.nextInt();
		int[][] mat2 = new int[p][q];
		System.out.println("Enter elements of mat2: ");
		for(i=0;i<p;i++){
			for(j=0;j<q;j++){
				mat2[i][j]=sc.nextInt();
			}
		}

		if(m==p && n==q){
			add(mat1,mat2,m,n);
		}else{
			System.out.println("Cannot Add.");
		}
	}
}
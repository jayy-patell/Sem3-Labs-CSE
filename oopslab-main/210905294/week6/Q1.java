import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

class Person{
	private String name;
	//private GregorianCalendar DOJ;
	private Date DOB;  //created a refernce

	Person(String naam, int d,int m,int y){
		//GregorianCalendar gcal = ne GregorianCalendar(d,m,y);
		//DOJ=gcal;
		DOB= new Date(d,m,y);
		name=naam;
	}	

	void display(){
		System.out.println("\nName: "+name);
		System.out.println("\nDate of Birth: "+DOB);
	}
}



class Date{
	int d,m,y;
	Date(int d,int m,int y){
		d=d;
		m=m;
		y=y;
	}
	public String toString(){
		return (d+"/"+m+"/"+y);
	}
}

class College_Graduate extends Person{
	private double gpa;
	private int grad_year;
	College_Graduate(String naam, int d,int m,int y, double gpavg, int yr){
		super(naam,d,m,y);
		grad_year=yr;
		gpa = gpavg; 
	}

	void display(){
		System.out.println("\nYear of Graduation: "+grad_year+"\nGrade Point: "+gpa);
		super.display();
	}
}

class Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of students: ");
		int n = sc.nextInt();
		College_Graduate[] p = new College_Graduate[n];

		for(int i=0;i<n;i++){
			System.out.println("Enter details of student "+i+1);
			System.out.println("Name: ");
			String fName = sc.next();
			System.out.println("Enter date of DOB: ");
			int d = sc.nextInt();
			System.out.println("Enter month of DOB: ");
			int m = sc.nextInt();
			System.out.println("Enter year of DOB: ");
			int y = sc.nextInt(); 
			System.out.println("Enter graduation year: ");
			int gy = sc.nextInt();
			System.out.println("Enter GPA: ");
			double gpa = sc.nextDouble();

			p[i]=new College_Graduate(fName,d,m,y,gpa,gy);
		}

		for(int i=0;i<n;i++){
			p[i].display();
		}
	}
}
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

class Student {
    String regno;
    String fName;
    GregorianCalendar DOJ;
    short sem;
    float gpa,cgpa;
    static int count=1;

    Student() {
        count+=1;
    }

    Student(String name,int d,int m, int y,short semester,float gpavg,float cgpavg) {
        GregorianCalendar gcal = new GregorianCalendar(y,m,d);    //to initialise object(gcal) with default time and date-set
        // String st = Integer.toString(gcal.get(1));
        // String yst = st.substring(2,4);
        // String n = Integer.toString(count);
        String str = "";
        if(count>=1 && count<=9){
            str = str + y%100 + "0" + count;
        }
        regno = str;
        fName = name;
        DOJ = gcal;
        sem=semester;
        gpa=gpavg;
        cgpa=cgpavg;
        count+=1;
    }

    void display() {
        System.out.println("\nName of student: "+fName+"\nRegistration Number: "+regno+"\nDate of joining: "+DOJ.get(Calendar.DATE)+"/"+DOJ.get(Calendar.MONTH)+"/"+DOJ.get(Calendar.YEAR)+"\nSemester: "+sem+"\nGPA: "+gpa+"\nCGPA: "+cgpa);
    }

    static void sortbysem(Student s[]) {
        int n=s.length;
        Student temp;
        //int i,j;
        for(int i = 0; i < n-1; i++) {
            for(int j= i; j < n; j++) {
                if ( s[i].sem < s[j].sem) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
                else if (s[i].sem == s[j].sem) {
                    if (s[i].cgpa < s[j].cgpa) {
                        temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }
        }
    }



}

class RegistrationNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student stds[] = new Student[n];
        for(int i=0;i<n;i++) {
            System.out.println("\nEnter details for student number "+(i+1));
            System.out.print("Enter your name ");
            String fName = sc.nextLine();
            System.out.print("Enter day of DOJ ");
            int d = sc.nextInt();
            System.out.print("Enter month of DOJ ");
            int m = sc.nextInt();
            System.out.print("Enter year of DOJ ");
            int y = sc.nextInt();
            System.out.print("Enter your semester ");
            short semester = sc.nextShort();
            System.out.print("Enter your gpa ");
            float gpavg = sc.nextFloat();
            System.out.print("Enter your cgpa ");
            float cgpavg = sc.nextFloat();
            sc.nextLine();

            stds[i] = new Student(fName,d,m,y,semester,gpavg,cgpavg);
        }

        System.out.println("\nDisplaying details of all students:\n");
        for(int i=0;i<n;i++) {
            System.out.println("\nDisplaying details for student number "+(i+1));
            stds[i].display();
        }

        int input = 0;
        do{
            System.out.println("\nSort using 1.Semester and CGPA 2.Name 3.Exit");
            System.out.println("Enter what you want to do: ");
            input = sc.nextInt();

            if(input == 1){
                Student.sortbysem(stds);
                for(int i=0;i<n;i++) {
                    stds[i].display();
                }
            }
            else if(input == 2){
                
            }
            else if(input == 3){
                break;
            }
        }while(input!=3);
    }
}



/*
Things not able to understand:
toString()-> how to access it, and what do you mean when you have to override toString method
parseInt->
Integer.* ->
*/
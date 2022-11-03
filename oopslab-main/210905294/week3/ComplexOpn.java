import java.util.Scanner;

    class Complex {
        double real;
        double imag;

        void set(double r, double i) {
            real=r;
            imag=i;
        }

        void display() {
            System.out.println(real+" + "+imag+"i");
        }

        Complex add(Complex c1) {
            Complex cAdd = new Complex();
            cAdd.real = c1.real + real;
            cAdd.imag = c1.imag + imag;
            return cAdd;                    //we have to store this somewhere in main
        }

        void subtract(Complex c1, Complex c2) {
            if (c2.real > c1.real) {
                real = c2.real - c1.real;    //c3 ka real which is implicitly passed
                imag = c2.imag - c1.imag;    //c3 ka imag
            }
            else {
                real = c1.real - c2.real;
                imag = c1.imag - c2.imag;
            }
        }
    }

class ComplexOpn
{
    public static void main(String args[]) 
    {

        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        System.out.print("Enter the real and complex part of complex number 1 ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        
        System.out.print("Enter the real and complex part of complex number 2 ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        
        
        c1.set(r1,i1);
        //r1=c1.real;
        c2.set(r2,i2);
        //i2=c1.imag;


        System.out.println("The first complex number is:");
        c1.display();

        System.out.println("The second complex number is:");
        c2.display();

        c3=c1.add(c2);

        System.out.println("The complex number after addition is:");
        c3.display();

        c3.subtract(c1,c2);

        System.out.println("The complex number after subtraction is:");
        c3.display();

        sc.close();
    }
}
    


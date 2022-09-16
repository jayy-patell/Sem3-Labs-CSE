#include<stdio.h>
#include<stdlib.h>

typedef struct complex{
    float real;
    float imag;
}complex;

complex Add(complex m, complex n)
{
    complex flag;
    flag.real = m.real + n.real;
    flag.imag = m.imag + n.imag;
    return(flag);
}

complex Subt(complex m, complex n)
{
    complex flag1;
    flag1.real = m.real - n.real;
    flag1.imag = m.imag - n.imag;
    return(flag1);
}

complex Mult(complex m, complex n)
{
    complex flag2;
    flag2.real = (m.real*n.real)-(m.imag*n.imag);
    flag2.imag = (m.real*n.imag)+(m.imag*n.real);
    return(flag2);
}

// complex Add(complex m, complex n);
// complex Mult(complex m, complex n);
// complex Subt(complex m, complex n);

int main()
{
    complex m,n,result,answer,jawab;
    printf("Enter real and imaginary part for m:\n");
    scanf("%f %f",&m.real,&m.imag);
    printf("Enter real and imaginary part for n:\n");
    scanf("%f %f",&n.real,&n.imag);

    result = Add(m,n);
    answer = Subt(m,n);
    jawab = Mult(m,n);
    printf("Sum is %0.1f+%0.1fi\n", result.real,result.imag);
    printf("Subtraction is %0.1f+%0.1f\n", answer.real,answer.imag);
    printf("Multiplication is %0.1f+%0.1f\n",jawab.real,jawab.imag);


    return 0;
}


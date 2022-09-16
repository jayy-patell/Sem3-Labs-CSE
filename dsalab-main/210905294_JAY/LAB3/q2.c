#include<stdio.h>
#include<stdlib.h>

 typedef struct student{
    char name[50];
    int rollno;
    float cgpa;
}student;

int main()
{
    student n[2];
    int i;
    for(i=0;i<2;i++)
    {
        printf("Enter the name of the %d student:\n",i+1);
        scanf("%s",n[i].name);
        printf("Enter the rollno of %d stdent:\n",i+1);
        scanf("%d",&n[i].rollno);
        printf("Enter the cgpa of %d student:\n",i+1);
        scanf("%f",&n[i].cgpa);

    }

    for(i=0;i<2;i++)
    {
        printf("name of %d student is %s, rollno is %d and CGPA is %f\n",i+1,n[i].name,n[i].rollno,n[i].cgpa);
        // printf("rollno of %d student is %d\n",i+1,n[i].rollno);
        // printf("CGPA of %d student is %0.00f\n",i+1,n[i].cgpa);
    }


    for (i=0;i<=1;i++)
    {
        for (int j=0; j<=1;j++)
        {
            int temp=0;
            if((n[i].rollno)>(n[i+1].rollno))
            {
                temp = n[i].rollno;
                n[i].rollno = n[i+1].rollno;
                n[i+1].rollno = temp;

            }
        }
    }

    for(i=0;i<2;i++)
        printf("%d\t %s\t %f\n",n[i].rollno,n[i].name,n[i].cgpa);

return 0;
}
#include<stdio.h>
#include<stdlib.h>

struct DOB
{
int day;
int month;
int year;
};
struct Address
{
int house_number;
int zip_code;
char state[50];
};
struct employee
{
char name[50];
struct DOB dob;
struct Address adrs;
};

void read(struct employee *ptr1,int n)
{
int i;
for(i=0;i<n;i++) {
printf("Enter name of employee %d\n",i+1);
scanf("%s",((ptr1+i)->name));
printf("Enter DOB of employee %d (DD/MM/YYYY)\n",i+1);
scanf("%d %d %d",&((ptr1+i)->dob.day),&((ptr1+i)->dob.month),&((ptr1+i)->dob.year));
printf("Enter House number , Zipcode , State of employee %d\n",i+1);
scanf("%d %d %s",&((ptr1+i)->adrs.house_number),&((ptr1+i)->adrs.zip_code),((ptr1+i)->adrs.state));
}
}

void display(struct employee *ptr1,int n)
{
int i;
for(i=0;i<n;i++) {
printf("Name: %s\t",ptr1[i].name);
printf("DOB: %d/%d/%d\t",((ptr1+i)->dob.day),((ptr1+i)->dob.month),((ptr1+i)->dob.year));
printf("Address: House number %d , Zipcode - %d , State - %s",((ptr1+i)->adrs.house_number),((ptr1+i)->adrs.zip_code),((ptr1+i)->adrs.state));
printf("\n");
}
}

int main()
{
struct employee *ptr1;
struct DOB *ptr2;
int n;
printf("Enter number of employee's\n");
scanf("%d",&n);
ptr1 = (struct employee *)malloc(n*sizeof(struct employee));
read(ptr1,n);
display(ptr1,n);
return 0;
}
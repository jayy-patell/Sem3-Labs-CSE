#include<stdio.h>
#include<string.h>

struct employee{
    char name[20];
    struct dob{
        int date;
        char month[10];
        double year;
    }DOB;
    struct address{
        int house_num;
        double zip_code;
        char state[20];
    }Address;
};

int main(){
    int i,n;
    printf("Enter number of employees: ");
    scanf("%d", &n);
    struct employee employees[n];
    struct employee* ptr = &employees[0];
    for(i=0;i<n;i++){
        printf("Enter details of employee %d:\n", i+1);
        printf("Name: ");
        scanf("%s", (*ptr).name);
        printf("Date of birth(in day/month/year): \n");
        scanf("%d%s%lf", &employees[i+1].DOB.date, employees[i+1].DOB.month, &employees[i+1].DOB.year);
        printf("Address(HouseNo.,Zip Code,State): \n");
        scanf("%d%lf%s", &employees[i+1].Address.house_num, &employees[i+1].Address.zip_code, employees[i+1].Address.state);

    }

    for(i=0;i<n;i++){
        printf("Employee %d:\n", i+1);
        printf("Name: %s\n", (*ptr).name);
        printf("Date of birth(in day/month/year): %d%s%lf \n", employees[i+1].DOB.date, employees[i+1].DOB.month, employees[i+1].DOB.year);
        printf("Address(HouseNo.,Zip Code,State): %d%lf%s \n", employees[i+1].Address.house_num, employees[i+1].Address.zip_code, employees[i+1].Address.state);

    }
    return 0;
}
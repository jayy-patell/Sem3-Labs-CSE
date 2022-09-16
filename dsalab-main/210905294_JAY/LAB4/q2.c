#include<stdio.h>
#include<string.h>
#include<stdlib.h>

void copyStr(char str[],char str1[],int i){

    //base case
    if(*(str+i) == "\0" || *(str+i) == ""){
        return;
    }
    
    *(str1+i)=*(str+i);
    //recursive call
    copyStr(str,str1,i++);

}

int main(){
    int i=0;
    char str[50];
    char str1[50];   //empty string
    printf("Enter a string: ");
    scanf("%s",str);


    copyStr(str,str1,i);

    printf("Printing copied string: ");
    printf("%s",str1);

    return 0;
}
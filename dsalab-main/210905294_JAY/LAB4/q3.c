// #include<stdio.h>
// #include<stdlib.h>
// #include<string.h>

// bool isPalin(char str[],int i){
//     //base case
//     if(){
//         return;
//     }


// }

// int main(){
//     char str[50];
//     int i=0;
//     printf("Enter a string: ");
//     scanf("%s",str);

//     isPalin(str,i);

//     return 0;
// }

// A recursive C program to
// check whether a given number
// is palindrome or not
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool isPalRec(char str[],int s, int e){
	// If there is only one character
	if (s == e)
	return true;

	// If first and last
	// characters do not match
	if (str[s] != str[e])
	return false;

	// If there are more than
	// two characters, check if
	// middle substring is also
	// palindrome or not.
	if (s < e + 1)
	return isPalRec(str, s + 1, e - 1);

	return true;
}

bool isPalindrome(char str[])
{
int n = strlen(str);

// An empty string is
// considered as palindrome
if (n == 0)
	return true;

return isPalRec(str, 0, n - 1);
}

// Driver Code
int main()
{
	char str[50];
    printf("Enter a string: ");
    scanf("%s", str);

	if (isPalindrome(str))
	printf("Yes");
	else
	printf("No");

	return 0;
}

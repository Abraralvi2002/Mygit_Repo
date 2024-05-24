//Write a C program to find the length of string without using function strlen().
#include<stdio.h>
int main(){
    char str[100];
    int s=0;
    printf("Enter The String:\n");
    fgets(str, sizeof(str), stdin);//fgets to read the entire line of input, including spaces
    for (int i = 0; str[i] != '\0'; i++) {
        s++;
    }
    printf("The Size of Given String is: %d",s);
    return 0;
}
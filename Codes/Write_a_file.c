//Write a C program to write to a text file.
#include <stdio.h>
int main(){
    FILE *fptr;
    fptr = fopen("Hi.txt","w");
    fprintf(fptr, "Welcome To C Program");
    fclose(fptr);
    return 0;
}
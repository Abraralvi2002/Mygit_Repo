//Write a C program to Read a line from a file and display it.
#include <stdio.h>
int main(){
    FILE *fptr;
    char storage[100000];
    fptr = fopen("Hi.txt", "r");
    if (fgets(storage, sizeof(storage), fptr) != NULL) {
        printf("The content of the file is: %s",storage);
    }
    fclose(fptr);
    return 0;
}
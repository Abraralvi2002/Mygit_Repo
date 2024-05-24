//Write a C program to concatenate two strings without using strcat().
#include<stdio.h>
#include<string.h>
int main(){
    char str1[200],str2[100];
    printf("Enter the first string:\n");
    fgets(str1, sizeof(str1), stdin);
    str1[strcspn(str1, "\n")] = '\0';
    printf("Enter the second string:\n");
    fgets(str2, sizeof(str2), stdin);
     int b = strlen(str1);
     int i,j;
     for(i=b,j=0;str2[j] != '\0';i++,j++){
            str1[i] = str2[j];
     }
      str1[i] = '\0';
     printf("The Concate of Two String is:\n%s",str1);
     return 0;
}
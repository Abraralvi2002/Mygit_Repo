//Write a C program to calculate factorial of any integer
#include<stdio.h>
int main(){
    int n,f;
    printf("Enter The Integer You Want to Find The Factorial:\n");
    scanf("%d",&n);
    f = 1;
    for(int i=1;i <= n;i++){
        f = i * f;
    }
    printf("The Factorial of The Given Number is: %d",f);
    return 0;
}
//Write a program to verify a number wheather it is a prime number or not.
#include<stdio.h>
int main(){
int prime;
    printf("Enter The Number You Wants To Verify:\n");
    scanf("%d", &prime);
    int isPrime = 1;

    for (int i = 2; i <= prime / 2; i++)
    {
        if (prime % i == 0)
        {
            isPrime = 0;
            break;
        }
    }

    if (isPrime)
    {
        printf("%d is a prime number", prime);
    }
    else
    {
        printf("%d is not an prime number", prime);
    }
    return 0;

}
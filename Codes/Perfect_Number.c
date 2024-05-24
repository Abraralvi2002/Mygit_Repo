//Write a C program to verify a perfect number.
#include <stdio.h>

int main()
{
    int number;
    printf("Enter The Number You Wants To Verify:\n");
    scanf("%d", &number);
    int divisorSum = 0;

    if(number > 0){
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
            {
                divisorSum += i;
            }
        }
    }

    if(number == divisorSum){
        printf("%d is a perfect number", number);
    }else{
        printf("%d is not an perfect number", number);
    }

    return 0;
}
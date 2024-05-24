//Write a program to evaluate the series: 1*3+2*5+3*7+……..+n*(2n+1)
#include <stdio.h>
int main(){
    int n;
    printf("Enter The 'N'th Number of The Series:\n");
    scanf("%d", &n);
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        sum += i * (2 * i + 1);
    }
    printf("The Sum of The Series is: %d\n", sum);
    return 0;
}
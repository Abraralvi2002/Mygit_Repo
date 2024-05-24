//Write a program in C to calculate the sum of the series: 1+(1+2)+(1+2+3)+…….+(1+2+…+n).
#include <stdio.h>
int main(){
    int n;
    printf("Enter The 'N'th Number of The Series:\n");
    scanf("%d", &n);
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
        sum = sum + i * (i + 1) / 2;
    }

    printf("%d", sum);

    return 0;
}
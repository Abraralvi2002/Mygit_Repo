//1+3+5+7…………..+n” Find the sum of the given series in C
#include <stdio.h>
int main() {
    int n;
    int sum = 0;

    printf("Enter the last odd number of the series: \n");
    scanf("%d", &n);
    for (int i = 1; i <= n; i += 2) {
        sum += i;
    }
    printf("The sum of the series is: %d\n", sum);

    return 0;
}

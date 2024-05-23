//Write a program in C to find GCD using C.
#include <stdio.h>
int GCD(int a, int b) {
    int temp;
    for (; b != 0;) {
        temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main() {
    int n, gcd, num;
    printf("Enter the number of integers: ");
    scanf("%d", &n);
    printf("Enter integer 1: ");
    scanf("%d", &gcd);
    for (int i = 2; i <= n; i++) {
        printf("Enter integer %d: ", i);
        scanf("%d", &num);
        gcd = GCD(gcd, num);
    }
    printf("The GCD of the given numbers is: %d\n", gcd);

    return 0;
}

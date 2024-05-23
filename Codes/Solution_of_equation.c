//“Ax2 + bx + c = 0” write a program in C to find the value of x.
#include <stdio.h>
#include <math.h>

int main() {
    int a, b, c;
    double d, x1, x2;

    printf("Enter the value of 'A', 'B' and 'C' of 'Ax^2 + Bx + C = 0'\n");
    scanf("%d %d %d", &a, &b, &c);
    d = (b * b) - (4 * a * c);

    if (d > 0) {
        x1 = (-b + sqrt(d)) / (2 * a);
        x2 = (-b - sqrt(d)) / (2 * a);
        printf("The roots are real and different.\n");
        printf("X1 = %.2lf\n", x1);
        printf("X2 = %.2lf\n", x2);
    } else if (d == 0) {
        x1 = -b / (2 * a);
        printf("The root is real and the same.\n");
        printf("X = %.2lf\n", x1);
    } else {
        double realPart = -b / (2.0 * a);
        double imaginaryPart = sqrt(-d) / (2.0 * a);
        printf("The roots are complex and different.\n");
        printf("X1 = %.2lf + %.2lfi\n", realPart, imaginaryPart);
        printf("X2 = %.2lf - %.2lfi\n", realPart, imaginaryPart);
    }

    return 0;
}

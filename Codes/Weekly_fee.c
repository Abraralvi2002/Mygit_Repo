//2.An employee’s total weekly pay is calculated by multiplying the hourly wage and number of regular hours plus any overtime pay which in turn is calculated as total overtime hours multiplied by 1.5 times the hourly wage. Write a program that takes place as inputs the hourly wage, total regular hours, and total over time hours and prints an employee’s total weekly pay
#include<stdio.h>
int main(){
    double hw,rh,oh,ow,tf;
    printf("Hourly Wage of The Employee:\n");
    scanf("%lf",&hw);
    printf("Total Regular Working Hour in A Week:\n");
    scanf("%lf",&rh);
    printf("Total Over Time Working Hour in A Week:(if N/A enter 0)\n");
    scanf("%lf",&oh);
    ow = hw * 1.5;
    tf = (hw * rh) + (ow * oh);
    printf("Employee's Total Weekly Pay: %.2lf",tf);
    return 0;
}
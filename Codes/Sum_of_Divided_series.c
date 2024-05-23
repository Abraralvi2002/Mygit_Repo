//“1+ 1/2 + 1/3 +……..+ 1/n”  write a program in C to find the sum of series.
#include<stdio.h>
int main(){
    double n,total=0;
    printf("Enter The Last Number of Series:'1/N'.\n");
    scanf("%lf",&n);
    for(int i=1;i <= n;i++){
        total = (1.0 / i) + total;
    }
    printf("%.3lf",total);
    return 0;
}
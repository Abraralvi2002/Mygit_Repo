//3.	Write a program: 1+2^n+3^n+4^n+………+n^n (where n> 0).
#include<stdio.h>
#include<math.h>
int main(){
    double n,total=0;
    printf("Enter The Last Number of Series:'N'(where N>0).\n");
    scanf("%lf",&n);
    if(n > 0);
    for(int i=1;i <= n;i++){
        total = pow(i,n) + total;
    }
    printf("%.0lf",total);
    return 0;
}
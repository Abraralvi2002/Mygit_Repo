//A program in C to find the sum of following series: 1^2+2^2+3^2+……..+n^2.
#include<stdio.h>
#include<math.h>
int main(){
    double n,total=0;
    printf("Enter The Last Number of Series:'N'(where N>0).\n");
    scanf("%lf",&n);
    if(n > 0);
    for(int i=1;i <= n;i++){
        total = pow(i,2) + total;
    }
    printf("%.0lf",total);
    return 0;
}
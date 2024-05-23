//Write a C program to find the sum of following series: 1! + 2! + 3! +……..+ n!
#include<stdio.h>
int main(){
   int n,f,sum =0;
   printf("Enter The Last Number of The Series:\n");
   scanf("%d",&n);
   for(int i=1;i<=n;i++){
     f = 1;
      for(int j=1;j<=i;j++){
        f = f * j;
      }
      sum = sum + f;
   }
   printf("The Summation of Factorial Series: %d",sum);
    return 0;
}
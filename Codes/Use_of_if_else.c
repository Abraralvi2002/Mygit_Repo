//A program in C to find Largest number given by user(use of If else is needed)
#include<stdio.h>
int main(){
    int n;
    printf("How many numbers you want to be excecuted? \n");
    scanf("%d",&n);
    int num[n];
    printf("Enter Your Numbers: \n");
    for(int j = 0;j < n;j++){
        scanf("%d", &num[j]);
    }
	int big = num[0];
    for(int i = 1;i < n;i++){
        if(num[i] <= big){           
        }else{
          big = num[i];
        }
    }
     printf("The largest number is: %d",big);
    return 0;
}
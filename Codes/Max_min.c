//Write a program in C to find the max and min value in an array.
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
	int max = num[0];
    for(int i = 1;i < n;i++){
        if(num[i] <= max){           
        }else{
          max = num[i];
        }
    }
    	int min = num[1];
    for(int k = 2;k < n;k++){
        if(num[k] >= min){           
        }else{
          min = num[k];
        }
    }
     printf("The Max Value is: %d\n",max);
     printf("The Min Value is: %d",min);
    return 0;
}
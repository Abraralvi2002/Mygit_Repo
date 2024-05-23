//Write a program in C to find the average value of 5 numbers in an array. (The user will input the numbers).
#include<stdio.h>
int main(){
    int arr[5];
    double avg,total=0.0;
    printf("Enter Five Integer Numbers One By One:\n");
    for(int i=0;i<5;i++){
        scanf("%d",&arr[i]);
    }
    for(int j=0;j<5;j++){
        total = arr[j] + total; 
    }
    avg = total / 5;
    printf("The Average Value of Given Number is: %.3lf",avg);
    return 0;

}
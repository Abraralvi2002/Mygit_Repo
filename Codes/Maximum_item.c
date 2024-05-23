//Write a program to find max price from 20 items.
#include<stdio.h>
int main(){
    double arr[20],m;
    printf("Enter The Price of 20 Items One By One:\n");
    for(int i=0;i<20;i++){
        scanf("%lf",&arr[i]);
    }
    m = arr[0];
    for(int j=0;j<20;j++){
        if(arr[j] > m){
            m = arr[j];
        }
    }
    printf("The Maximum Price is: %.2lf Tk",m);
    return 0;

}
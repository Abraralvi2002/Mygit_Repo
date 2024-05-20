//A C program to find the smallest value in the array of a[10]={10,9,7,101,23,44,12,78,34,3}
#include<stdio.h>
int main(){
    int arr[10] ={10,9,7,101,23,44,12,78,34,3};
    int s = arr[0];
    for(int i=1;i<9;i++){
        if(arr[i] < s){
            s = arr[i];
        }
    }
    printf("The smallest number in the Array is: %d",s);

    return 0;
}
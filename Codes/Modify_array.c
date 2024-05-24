//Suppose an array is {4,5,6,7}. Write a C program that will output like {4,5},{4,6},{4,7},{5,6},{5,7},{6,7}.
#include<stdio.h>
int main(){
    int arr[] = {4,5,6,7};
    int length = sizeof(arr) / sizeof(arr[0]);
    for (int i = 0; i < length; i++)
    {
        for (int j = i + 1; j < length; j++)
        {
            printf("{%d, %d},", arr[i], arr[j]);
        }
    }
    return 0;
}
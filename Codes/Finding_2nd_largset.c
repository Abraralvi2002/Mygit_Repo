//A C program to find the Second Largest value in an User Defined array.
#include<stdio.h>
int main(){
    int n;
    printf("How Many NUmbers You Are Going To Input?\n");
    scanf("%d",&n);
    int arr[n];
    printf("Enter The Numbers One By One:\n");
    for(int l=0;l < n;l++){
        scanf("%d",&arr[l]);
    }
    int big = arr[0];
    for(int i=1;i<n;i++){
        if(arr[i] > big){
            big = arr[i];
        }
    }
    for (int j = 0; j < n; j++) {
        if (arr[j] == big) {
            arr[j] = 0;
            break;
        }
    }

    int sb = arr[1];
    for(int k=1;k<n;k++){
        if(arr[k] > sb){
            sb = arr[k];
        }
    }
    printf("%d",sb);
    return 0;
}
//Write a C program to calculate GPA, Avg and Total marks.
#include<stdio.h>
int main(){
int n;
printf("How Many Subjects Will Be Included?\n");
scanf("%d",&n);
double arr1[n],arr2[n],GPA,AVG;
printf("Enter The Grade Points of Each Subject One By One:\n");
for(int i=0;i<n;i++){
    scanf("%lf",&arr1[i]);
}
printf("Now Enter The Marks of Each Subject One By One:\n");
for(int j=0;j<n;j++){
    scanf("%lf",&arr2[j]);
}
double A = 0;
for(int k=0;k<n;k++){
    A = arr1[k] + A;
}
    GPA = A / n;
double B = 0;
for(int l=0;l<n;l++){
    B = arr2[l] + B;
}
    AVG = B / n;
printf("The GPA is: %.2lf \n The Total Mark is: %.2lf \n The Average Mark is: %.2lf",GPA,B,AVG);
    return 0;

}
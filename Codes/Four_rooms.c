//A program in C to find the given coordinate is in which quadrent
#include<stdio.h>
int main(){
    int x,y;
    scanf("%d %d", &x, &y);
    if( -1000 <= x && x >= 1000);
    if( -1000 <= y && y >= 1000);
    if( x != 0 && y != 0);
    if(x > 0 && y > 0){
        printf("1");
    }else if( x < 0 && y > 0){
        printf("2");
    }else if( x < 0 && y < 0){
        printf("3");
    }else if( x > 0 && y < 0){
        printf("4");
    }
    return 0;

}
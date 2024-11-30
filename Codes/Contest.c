#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);

    for (int i = 0; i < t; i++) {
        int s;
        float total = 0.0;
        scanf("%d",&s);
       for(int j = 0;j < s; j++){
       float gpa;
       scanf("%f",&gpa);
        float total = total + gpa;
       }
       float res = total / s;
       printf("")
    }

    return 0;
}

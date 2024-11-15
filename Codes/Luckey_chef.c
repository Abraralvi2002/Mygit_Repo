#include <stdio.h>
int main() {
char str[10];
    fgets(str, 10, stdin);
    printf("%c",str[6]);
    return 0;
}
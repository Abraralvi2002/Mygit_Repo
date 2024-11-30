#include <stdio.h>
int sum(int m[], int s, char g) {
    int sum = 0;
    int startpoint = (g == 'b') ? 0 : 1;
    for (int i = startpoint; i < s; i += 2) {
        sum += m[i];
    }
    return sum;
}
int main() {
    int s;
    scanf("%d", &s);
    int m[s];
    for (int i = 0; i < s; i++) {
        scanf("%d", &m[i]);
    }
    char g;
    scanf(" %c", &g);
    int result = sum(m, s, g);
    printf("%d\n", result);
    return 0;
}

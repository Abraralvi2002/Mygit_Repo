#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank "; // Increased the size to accommodate concatenated input
    int j;
    double k;
    char l[100],q[200];
    strcpy(q,s);

    // Reading an integer and a double
    scanf("%d %lf", &j, &k);
    
    // Consume the leftover newline character from scanf
    getchar();
    
    // Reading the string input safely
    fgets(l, 100, stdin);
    
    // Remove the newline character from the string if present
    l[strcspn(l, "\n")] = 0;
    
    // Performing operations and printing the results
    int m = j + i;
    printf("%d\n", m);
    
    double n = k + d;
    printf("%.1lf\n", n);
    
    // Concatenating strings safely
    strcat(s, l);
    printf("%s\n", s);
    
    return 0;
}

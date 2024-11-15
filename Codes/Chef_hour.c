#include <stdio.h>
int main() {
int t,n,m,out;
scanf("%d",&t);
for(int i=0;i<t;i++){
    scanf("%d %d",&n,&m);
    out = n - m;
    printf("\n%d",out);
}
    return 0;
}
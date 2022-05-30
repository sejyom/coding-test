#define MAX 100
#include <stdio.h>
int main() {
    int a[MAX], result[MAX], i=0, lcv;
    
    for(i=0; i<MAX; i++) {
        scanf("%d %d", &a[i%2], &a[i+1%2]);
        if(a[i%2]==0 && a[i%2]==0)
            break;
        else{
            result[i]=a[i%2]+a[i+1%2];
            printf("%d\n", result[i]);
        }
    }        
}

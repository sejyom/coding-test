#include <stdio.h>
int main(void) {
    int h, m, sum=0;
    scanf("%d %d", &h, &m);
    scanf("%d", &sum);
    m+=sum;
    if (m>=60) {
        h+=m/60;
        m%=60;
        if (h>=24)
            h-=24;
    }
    printf("%d %d", h, m);
    return 0;
}

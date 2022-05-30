#include <stdio.h>
int main(void) {
    int year;
    printf("입력입력입력 ");
    scanf("%d", &year);
    
    if(year<0 || year>4000) {
        printf("잘못된 입력입니다.");
        return 0;
    }
    
    if((year%4==0 && year!=(year%100==0)) || (year%4==0 && year%400==0))
        return 1;
    else return 0;
}

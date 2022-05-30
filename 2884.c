// 입력한 시간에서 -45분 한 시간 출력
#include <stdio.h>
int main(void) {
  int h, m;
  printf("시간 입력: ");
  scanf("%d %d", &h, &m);

  if(!(h>=0 && h<=23) || !(m>=0 && m<=59)) {
    printf("잘못된 입력입니다");
    return 0;
  }
  if(h==0) {
    if(m<45) {
      h = 23;
      m = 60-(45-m);
    }
    else {
      m = m-45;
    }
  }
  else {
    if(m>=45)
      m -= 45;
    else {
      h -= 1;
      m = 60-(45-m);
    }
  }
  printf("%d %d", h, m);
}

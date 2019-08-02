#include <stdio.h>
int main() {
	int num,sum=0,fd,ld;
  scanf("%d",&num);
  ld=num%10;
  fd=num;
  while(num>=10)
  {
    num=num/10;
  }
  fd=num;
  sum=fd+ld;
  printf("%d",sum);
	return 0;
}
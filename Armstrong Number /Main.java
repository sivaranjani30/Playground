#include <stdio.h>
int main() {
	int num,ornum,rem,result=0;
  scanf("%d",&num);
  ornum=num;
  while (ornum!=0)
  {
    rem=ornum % 10;
    result += rem *rem*rem;
    ornum /=10;
  }
  if(result==num)
    printf("Armstrong Number",num);
  else
    printf("Not an Armstrong Number",num);
	return 0;
}
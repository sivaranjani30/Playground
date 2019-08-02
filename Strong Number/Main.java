#include <stdio.h>
int main() {
	int i,ornum,num,ldigit,sum=0;
  long fact;
  scanf("%d",&num);
  ornum=num;
  while(num>0)
  {
    ldigit=num%10;
    fact=1;
    for(i=1;i<=ldigit;i++)
        {
          fact =fact*i;
        }
        sum=sum+fact;
        num=num/10;
        }
        if(sum==ornum)
        {
          printf("Yes",ornum);
        }
        else
        {
          printf("No",ornum);
        }
  
	return 0;
}
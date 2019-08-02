#include<stdio.h>
int main()
{
	
long int n,i,fact=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    fact *=i;
  }
  printf("%ld",fact);
  return 0;
  

}
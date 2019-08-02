#include<stdio.h>
int main()
{
  int d;
  float r,area;
  scanf("%d",&d);
  r=(float)d/2;
  area=3.14*r*r;
  printf("%0.2f",area);
  
  return 0;
}
#include<stdio.h>
int main()
{
  int num,dig,num1;
 scanf("%d",&num);
  dig=num%100;
  num1=dig/10;
    printf("%d",num1);
  return 0;
}
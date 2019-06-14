#include<stdio.h>
int main()
{
  int num,q1,rem1,ad1,temp1;
  scanf("%d",&num);
  temp1=num;
  q1=num/100;
  rem1=temp1%10;
  ad1=q1+rem1;
    printf("%d",ad1);

  return 0;
}
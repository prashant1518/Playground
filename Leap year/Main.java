#include<stdio.h>
int main()
{
  int num,num1;
    scanf("%d",&num);
  num1=num%4;
  
    if(num1==0)
      printf("Leap year");
  else
    printf("Not Leap year");
  return 0;
}
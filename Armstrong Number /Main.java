#include <stdio.h>
int main() {
  int num,sum=0,temp,remainder,digits=0;
  scanf("%d",&num);
  temp=num;
  while(temp != 0)
  {
    digits++;
    temp=temp/10;
  }
  temp=num;
  while(temp != 0)
  {
    remainder=temp%10;
    sum = sum+pow(remainder,digits);
    temp=temp/10;
  }
  if(num==sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  
	return 0;
}
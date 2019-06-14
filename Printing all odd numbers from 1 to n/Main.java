#include <stdio.h>
int main() {
  int i,n,count;
  scanf("%d",&n);
	for(i=0;i<=n;i++)
    {
      if(i%2 == 1)
      printf("%d\n",i);
      i+1;
    }
  
	return 0;
}
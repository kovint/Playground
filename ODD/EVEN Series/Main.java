#include<stdio.h>
int main()
{
  int a,n,d,t,nter;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    t=(n+1)/2;
    nter=(a+(t-1)*d);
    printf("%d",nter);
  }
  else
  {
    a=0,d=1;
    t=n/2;
    nter=(a+(t-1)*d);
    printf("%d",nter);
  }
  return 0;
}
  
    
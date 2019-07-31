#include <stdio.h>
int main() {
	char c;
  int t;
  scanf("%c",&c);
  if(c>='a' && c<='z')
  {
    printf("%c",c- 32);
  }
  else if(c>='A' && c<='Z')
  {
   printf("%c", c+ 32);
   }
  return 0;
}
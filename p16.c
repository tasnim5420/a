#include<stdio.h>
void main()
{
    int i,j,a=1,m=0,k=0,n;
    scanf("%d",&i);
    for(k=1;k<=i;k++)
    {
        for(n=i;n>a;n--)
         {
          printf(" ");
         }
        for(m=1;m<=k;m++)
        {
           printf("%d",m);

        }

++a;
printf("\n");

    //printf("\n");
    }

}

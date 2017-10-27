#include<stdio.h>
void main()
{
    int i,j,a=1,m=0,k=0,n;
    scanf("%d",&i);
    for(k=i;k>=1;k--)
    {
        for(n=1;n<=a;++n)
        {
            if(n<1)
             {
               printf(" ");
             }

        }
        for(m=k;m>=1;m--)
           {
           printf("*");
           }
         ++a;
     printf("\n");
    //printf("\n");
    }
}

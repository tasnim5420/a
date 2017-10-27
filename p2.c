#include<stdio.h>
int i,j,n,m;
void main()
{ printf("enter the lines:");
    scanf("%d",&m);
    printf("how many stars:");
    scanf("%d",&n);
    for(i=1;i<=m;i++)
    {
        for(j=1;j<=n;j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

#include<stdio.h>
int i,j,m,n;
void main(){
    printf("Enter the value:");
    scanf("%d%d",&m,&n);
    for(i=1;i<=m;i++)
     {
         for(j=1;j<=n;j++)
         {
            printf("%d",j);
         }
       printf("\n");
      }
}

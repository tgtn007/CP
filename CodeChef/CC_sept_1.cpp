#include <stdio.h>

int main() 
{
    
    int t;
    scanf("%d",&t);
    while(t--)
    {
        int n;
        scanf("%d",&n);
        int A[1000000000]={0};
        int a;
        int c=0;
        for(int i=0;i<n;i++)
        {
            scanf("%d",&a);
            if(a>0)
            {
                if (A[a]==false)
                {
                    c++;
                    A[a]=true;
                }
                
            }
            
        }
        
        printf("%d\n",c);
    }
 
 return 0;
}


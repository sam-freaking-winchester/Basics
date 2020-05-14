#include<iostream>
int greatestNumber(int a,int b,int c,int d)
{
    int t;
    t=(a>b) ? ((a>c)? a : ((c>b)?c:b) ): ((b>c)? b: ((c>a)?c:a));
    return (t>d)?t:d;
}
int main()
{
    int w,x,y,z;
    scanf("%d %d %d %d",&w,&x,&y,&z);
    printf("%d",greatestNumber(w,x,y,z));
    return 0;
}

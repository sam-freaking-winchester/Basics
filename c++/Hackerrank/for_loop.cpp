#include<iostream>
int main()
{
    char *s;
    int a,b;
    scanf("%d %d",&a,&b);
    for(int i=a;i<=b;i++)
    {
        switch (i) {
            case 1:{
                s="one";
                break;}
            case 2:{
                s="two";
                break;
            }
            case 3:{
                s="three";
                break;}
            case 4:{
                s="four";
                break;
            }
            case 5:{
                s="five";
                break;}
            case 6:{
                s="six";
                break;
            }
            case 7:{
                s="seven";
                break;}
            case 8:{
                s="eight";
                break;
            }
            case 9:{
                s="nine";
                break;
            }
            default :{
                if(i%2==0)
                    s="even";
                else
                    s="odd";
                break;
            }
        }
        printf("%s\n",s );
    }
}

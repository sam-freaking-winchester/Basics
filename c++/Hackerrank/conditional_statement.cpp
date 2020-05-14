#include<iostream>
int main()
{
    char *s;
    int number;
    scanf("%d",&number);
    switch (number) {
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
            s="Greater than 9";
            break;
        }
    }
    printf("%s\n",s);
}

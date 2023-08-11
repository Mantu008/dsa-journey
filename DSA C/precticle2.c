#include<stdio.h>   
int add(int a,int b){          
int d=a+b;   
    return d;   
}    
 
int add1(int*a,int*b){       int e=*a+*b;   
    return e;   
}   
   
int main(){   
   
 int a=5;       int b=10;   
printf("ENROLLMENT NO:-92201703001\n");       printf("Name:-MANTU KUMAR MORYA\n");   
int c=add(a,b); printf("the addition of two number using call by value is:%d\n",c);    int f=add1(&a,&b);       printf("the addition of two number using pass by address is:%d\n",f);   
     
return 0;   
} 

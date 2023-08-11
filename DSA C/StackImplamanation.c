#include<stdio.h>

#define max 10
int s[max],top=-1;
void push(int);
void pop();
void peep();
void change(int,int);
void display();

int main(){

     int pos=4;
     int val=89;

    printf("ENROLLMENT NO:-92201703001\n");
    printf("Name:-MANTU KUMAR MORYA\n");


// push value in stack
    push(1);
    push(2);
    push(3);
    push(4);
    push(5);
    push(6);
    push(7);
    push(8);
    push(9);
    push(10);
  
  // peek value of stack 
    peep();

  //pop value of stack  
     pop();

//chenge value of stack
    change(pos,val);

//print value of stack
    display();

    

    return 0;
}

void push(int n){
      if((max-top)>1){
        top=top+1;
        s[top]=n;
        printf("push element sucessfully..\n");
      }else{
        printf("stack overflow...\n");
      }
    
}

void pop(){
      if(top>=0 && top<max){
        top--;
        printf("pop element sucessfully..\n");
      }else{
        printf("stack underflow\n");
      }
}

void peep(){
      if(top>-1 && top<max){
       printf("peek value is:%d\n",s[top]);
      }else{
        printf("stack is empty\n");
      }
}

void change(int pos,int val){
    int i;
      for(i=top;i>=0;i--){
          if(i==pos){
            s[i]=val;
            printf("chenge element at given index sucessfully..\n");
          }
      }
}

void display(){
    int i;
    printf("print stack elments top to botton\n");
    for(i=top;i>=0;i--){
        printf("%d\n",s[i]);
    }
}
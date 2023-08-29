#include<stdio.h>

#define size 50
int arr[size];
int count=0;
int front=0;
int rear=0;


void push(int x);
void pop();
void peep();



void push(int x){
   if(count==size){
    printf("Queue if full\n");
   }else{
      arr[rear%size]=x;
      count++;
      rear++;
      printf("element push sucessfully from queue\n");
  }  
}


void pop(){
   if(count==0){
    printf("Queue if empty\n");
    }else{
      arr[front%size]=-1;
      count--;
      front++;
      printf("element pop sucessfully from queue\n");
  }  
}

void peep(){
      if(count==0){
    printf("Queue if empty\n");
    }else{
      printf("top element of stack is:%d\n",arr[front%size]);
  }
}

void display(){
    int i;
    printf("print queue:");
    for(i=(front%size);i<(rear%size);i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    
}



int main(){
   
    printf("ENROLLMENT NO:-92201703001\n");
    printf("Name:-MANTU KUMAR MORYA\n");
    push(5);
    push(8);
    push(9);
    push(2);
    push(1);
    display();
    peep();
    pop();
    display();
   


  return 0;
}
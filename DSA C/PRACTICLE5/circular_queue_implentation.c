#include<stdio.h>

#define size 50
int arr[size];
int count=0;
int front=0;
int rear=0;


void insert(int x);
void delete();
void peep();



void insert(int x){
   if(count==size){
    printf("Queue if full\n");
   }else{
      arr[rear%size]=x;
      count++;
      rear++;
      printf("element insert sucessfully from queue\n");
  }  
}


void delete(){
   if(count==0){
    printf("Queue if empty\n");
    }else{
      arr[front%size]=-1;
      count--;
      front++;
      printf("element delete sucessfully from queue\n");
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
    if(count==0){
          printf("queue is empty...\n");
          return;
    }
    printf("print queue:");
    for(i=(front%size);i<(rear%size);i++){
        printf("%d ",arr[i]);
    }
    printf("\n");
    
}



int main(){
   
    printf("ENROLLMENT NO:-92201703001\n");
    printf("Name:-MANTU KUMAR MORYA\n");
    int a;
    int choice=0;

     while(choice!=-1){
       printf("enter operation choice:");
       scanf("%d",&choice);

    switch (choice){
     case 1:
     printf("enter those value incert into stack:");
     scanf("%d",&a);
     insert(a);
     break;

     case 2:
     delete();
     break;

     case 3:
     display();
     break;
    
    default:
     printf("invalid argument...\n");
    break;

    }

     }
  


  return 0;
}
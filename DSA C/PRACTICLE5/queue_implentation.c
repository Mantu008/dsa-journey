#include<stdio.h>

#define count 0;
#define front 0;
#define rear 0;
#define size 50;

int arr[size];

void push(int x){
   if(count==size){
    printf("Queue if full");
   }else{
      arr[front%size]=x;
      count++;
      rear++;
      System.out.println("element push sucessfully from queue");
  }  
}


void pop(int x){
   if(count==0){
    printf("Queue if empty");
    }else{
      arr[rear%size]=-1;
      count--;
      front++;
      System.out.println("element pop sucessfully from queue");
  }  
}

void peep(int x){
      if(count==0){
    printf("Queue if empty");
    }else{
      printf("top element of stack is:%d\n",arr[front%size]);
  } 
}

void display(){
    int i;
    printf("print queue:\n");
    for(i=0;i<rear;i++){
        printf("%d\n",arr[i]);
    }
}

int main(){



    push(5);
    push(8);
    push(9);
    push(2);
    push(1);




  return 0;
}
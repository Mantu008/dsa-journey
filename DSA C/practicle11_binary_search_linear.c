#include<stdio.h>
 int Linear_search(int arr[],int n,int key);
 int Binary_search(int arr[],int key,int low,int high);

int main(){

    int arr[100];
    int n,i,key,res,choice;

    printf("enter size of array:-");
    scanf("%d",&n);

    printf("enter the array element:");

    for(int i=0;i<n;i++){
         scanf("%d",&arr[i]);
    }

    printf("enter search key:-");
    scanf("%d",&key);


        printf("enter your choice:-");
        scanf("%d",&choice);
        switch(choice){
               case 1:
               res=Linear_search(arr,n,key);
                if(res==-1){
               printf("key is not present in this given array");
                }else{
                 printf("key is present in this given array at index:-%d",res);
                 }
               break;

               case 2:
               res=Binary_search(arr,key,0,n-1);
                if(res==-1){
              printf("key is not present in this given array");
              }else{
              printf("key is present in this given array at index:-%d",res);
               }
               break;

               default:
               printf("not valid choice");
        }

    
}

  int Linear_search(int arr[],int n,int key){
       
       for(int i=0;i<n;i++){
          if(arr[i]==key){
               return i;
          }
       }

       return -1;
  }

  int Binary_search(int arr[],int key,int low,int high){
       int mid;

       while(low<=high){
          mid=(low+high)/2;

          if(arr[mid]==key){
                 return mid;
          }else if(arr[mid]<key){
               low=mid+1;
          }else{
               high=mid-1;
          }
       }

       return -1;
}
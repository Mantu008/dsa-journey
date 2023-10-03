#include<stdio.h>
 
void Bubblesort(int arr[],int n);

int main(){


    int arr[100];
    int n,i,key,res,choice;

    printf("enter size of array:-");
    scanf("%d",&n);

    printf("enter the array element:");

    for(int i=0;i<n;i++){
         scanf("%d",&arr[i]);
    }

    Bubblesort(arr,n);

    for(int i=0;i<n;i++){
         printf("%d ",arr[i]);
    }


}


void Bubblesort(int arr[],int n){

    for(int i=1;i<n;i++){
       for(int j=0;j<n-1;j++){
               if(arr[j]>=arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
       }
    }
}
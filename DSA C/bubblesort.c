#include<stdio.h>
 
void Bubblesort(int arr[],int n);

int main(){

    printf("Name:-Mantu Kumar Morya \n Enr no:-9201703001 \n");


    int arr[100];
    int n,i,key,res,choice;

    printf("enter size of array:-");
    scanf("%d",&n);

    printf("enter the array element:");

    for(int i=0;i<n;i++){
         scanf("%d",&arr[i]);
    }

    Bubblesort(arr,n);

    printf("sorted array is\n");

    for(int i=0;i<n;i++){
         printf("%d ",arr[i]);
    }


}


void Bubblesort(int arr[],int n){

    for(int i=1;i<n;i++){
       for(int j=0;j<n-i;j++){
               if(arr[j]>=arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
       }
    }
}
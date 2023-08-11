#include<stdio.h>


void ittration(int arr[],int size){
    for(int i=0;i<size;i++){
        printf("arr[%d]=%d\n",i,arr[i]);
    }
}

void incertion(int arr[],int size,int capacity,int element,int index){

    
         printf("array before incertion\n");
         
           for(int i=0;i<size;i++){
             printf("arr[%d]=%d\n",i,arr[i]);
         }

        

         for(int i=size+1;i>=index;i--){
               arr[i]=arr[i-1];
         }  
         arr[index]=element;


         printf("array after incertion\n");


           for(int i=0;i<size+1;i++){
             printf("arr[%d]=%d\n",i,arr[i]);
         }

}


void delication(int arr[],int size,int index){
    
    printf("before delition\n");
       for(int i=0;i<size+1;i++){
             printf("arr[%d]=%d\n",i,arr[i]);
         }

    for(int i=index;i<size+1;i++){
               arr[i]=arr[i+1];
         }  


          printf("after delition\n");

       for(int i=0;i<size;i++){
             printf("arr[%d]=%d\n",i,arr[i]);
         }

}

int linearsearching(int arr[],int size,int target){
    for(int i=0;i<size;i++){
         if(arr[i]==target){
            return i;
         }
    }

    return -1;
}


int binarysearching(int arr[],int size,int target){

    int startindex=0;
    int endindex=size-1;
   

    while(startindex<=endindex){

     int mid=startindex+(endindex-startindex)/2;

            if(target>arr[mid]){
                startindex=mid+1;
            }else if(target<arr[mid]){
                endindex=mid-1;  
            }else{
                return mid;
            } 
        }

        return -1;

    }



       
int main(){
    int arr[100]={1,2,3,4,5,6};
    int size=6;
    int cap=100;
    int index=3;
    int element=10;
    int target=6;

    ittration(arr,size);
    incertion(arr,size,cap,element,index);
    delication(arr,size,index);
    int p=linearsearching(arr,size,target);
    if(p==-1){
          printf("%d is not present in this given array\n",target);
    }else{
         printf("%d is  present at %d index in this given array\n",target,p);
    }


    int q=binarysearching(arr,size,target);
    if(q==-1){
          printf("%d is not present in this given array\n",target);
    }else{
         printf("%d is  present at %d index in this given array\n",target,q);
    }

   







    return 0;
}
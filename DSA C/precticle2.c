#include<stdio.h>
#include<stdlib.h>
int main(){

//demonstration of dynamic memory allocation(DMA)......................[malloc(),calloc(),realloc(),free()] use these function
//    int arr[10];   //in array initilization may memory is waste or short of memory

/*
     ptr=(int*)malloc(size of data)       :- it allocate memory dynamicly(it only allocate countionously)
     ptr=(int*)calloc(size,Sizeof(int))   :- it also allso memory dynamicly(may where memory is free it mins may not continous)
     realloc(ptr,(size*(Sizeof(int))))    :- reallocate memory  dynamicly
     free(ptr);                           :- deallocate memory to our pointer dynamicily
*/

      printf("ENROLLMENT NO:-92201703001\n");
      printf("Name:-MANTU KUMAR MORYA\n");

     int n,m;
     int*ptr;
     printf("enter the size of data:\n");
     scanf("%d",&n);

     //using malloc

     ptr=(int*)malloc(n*sizeof(int));

     printf("enter no\n");

     for(int i=0;i<n;i++){
        scanf("%d",ptr+i);            //instid of(ptr+i) we write (&ptr[i])  both are same address
     }

   printf("your data is:\n");

    for(int i=0;i<n;i++){
       printf("%d\n",*ptr+i);
    }

    printf("your address is:\n");
    for(int i=0;i<n;i++){
       printf("%d\n",ptr+i);
    }

    //using realloc

    printf("enter size again:\n");
    scanf("%d",&m);
    realloc(ptr,m*sizeof(int));  
    printf("reallocate size sucessfully\n");

   printf("enter other element\n");

    for(int i=n;i<m;i++){
        scanf("%d",ptr+i);
    } 


    printf("your new data included old data:\n");

    for(int i=0;i<m;i++){
       printf("%d\n",*ptr+i);
    }

  //free memory using free

    free(ptr);


  return 0;
}
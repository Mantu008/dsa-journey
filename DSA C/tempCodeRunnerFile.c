#include<stdio.h>
#include<stdlib.h>
int main(){



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
        scanf("%d",ptr+i);      //insted of(ptr+i) we write (&ptr[i])  both are same for address
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
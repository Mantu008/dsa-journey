#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
};
int value;
struct node *start=NULL,*ptr=NULL,*nn=NULL;
void create_list(){
    int stop_value;
    start=NULL;
    printf("Enter -1 to stop; Enter a value:");
    scanf("%d",&stop_value);
    while(stop_value!=-1){
        nn=(struct node*)malloc(sizeof(struct node));
        if(nn==NULL){
            printf("Memory Overflow.");
            exit(0);
        }
        nn->data=stop_value;
        nn->next=NULL;
        if(start==NULL)
            start=nn;
        else{
            ptr=start;
            while(ptr->next!=NULL)
                ptr=ptr->next;
          //  for(ptr=start;ptr->next!=NULL;ptr=ptr->next);
            ptr->next=nn;
        }
       printf("Enter -1 to stop; Enter a value:");
       scanf("%d",&stop_value);
    }
}
 void insert_front(int value){
    nn=(struct node*)malloc(sizeof(struct node));
    if(nn==NULL){
        printf("Memory Overflow");
        return;
    }
    nn->data=value;
    nn->next=start;
    start=nn;
    printf("Insertion Done at Front.");
}
void insert_end(int value){
    nn=(struct node*)malloc(sizeof(struct node));
    if(nn==NULL){
        printf("Memory Overflow");
        return;
    }
    nn->data=value;
    nn->next=NULL;
    if(start==NULL)
        start=nn;
    else{
            ptr=start;
            while(ptr->next!=NULL)
                    ptr=ptr->next;
            ptr->next=nn;
    }
    printf("Insertion Done at End.");
}
void display(){
    if(start==NULL)
        printf("List is Empty.");
    else{
        printf("List is: ");
        for(ptr=start;ptr!=NULL;ptr=ptr->next)
            printf("%d --> ",ptr->data);
    }
}
void insert_pos(int value){
    int pos,count;
    struct node *preptr;
    nn=(struct node*)malloc(sizeof(struct node));
    if(nn==NULL){
        printf("Memory Overflow");
        return;
    }
    nn->data=value;
    nn->next=NULL;
    printf("Enter a Position:");
    scanf("%d",&pos);
    if(pos==1 || start==NULL){
        nn->next=start;
        start=nn;
    }
    else{
            ptr=start;
            count=1;
            while(ptr!=NULL && count!=pos){
                preptr=ptr;
                ptr=ptr->next;
                count++;
            }
            nn->next = ptr;
            preptr->next = nn;
    }
}
void sort(){
    int temp;
    struct node *p1,*p2;
    for(p1=start;p1!=NULL;p1=p1->next){
        for(p2=p1->next;p2!=NULL;p2=p2->next){
            if(p1->data > p2->data){
                temp=p1->data;
                p1->data = p2->data;
                p2->data = temp;
            }
        }
    }
}
void insert_in_sorted(){
    struct node *preptr;
    sort();
    nn=(struct node*)malloc(1*sizeof(struct node));
    if(nn==NULL){
        printf("Memory Overflow");
        return;
    }
    nn->data=value;
    nn->next=NULL;
    if(start==NULL || start->data > nn->data){
            nn->next=start;
            start=nn;
            return;
    }
    ptr=start;
    preptr=start;
    while(ptr!=NULL && ptr->data < nn->data){
            preptr=ptr;
            ptr=ptr->next;
    }
    nn->next=ptr;
    preptr->next=nn;
}
void delete_first(){
    if(start==NULL){
        printf("List is Empty.");
        return;
    }
    ptr=start;
    printf("%d is deleted.",ptr->data);
    start=start->next;
    free(ptr);
}
void delete_last(){
    struct node *preptr,*cur;
    if(start==NULL){
        printf("List is Empty.");
        return;
    }
    for(preptr=start,ptr=start;ptr->next!=NULL;ptr=ptr->next)
            preptr=ptr;
    preptr->next=NULL;
    printf("%d is deleted.",ptr->data);
    if(start->next==NULL)
        start=NULL;
    free(ptr);
}
void delete_before_position(){
    int pos,count;
    struct node *preptr,*cur;
    if(start==NULL){
        printf("List is already Empty.");
        return;
    }
    printf("Enter a Position");
    scanf("%d",&pos);
    if(pos<=1){
        printf("Enter Valid position before to delete a Node.");
        return;
    }
    if(pos==2){
        delete_first();
        return;
    }
    ptr=start;
    preptr=start;
    cur=start;
    for(count=1;cur!=NULL&&count<pos;count++){
            preptr=ptr;
            ptr=cur;
            cur=cur->next;
    }
    preptr->next=cur;
    printf("%d is deleted.",ptr->data);
    free(ptr);
}
void delete_all_ocurrence(){
    struct node *preptr;
    if(start==NULL){
        printf("List is Empty.");
        return;
    }
    printf("Enter a Value to delete:");
    scanf("%d",&value);
    Again:
    if(start->data==value)
        delete_first();
    else{
        preptr=start;
        ptr=start;
        while(ptr!=NULL && ptr->data!=value){
            preptr=ptr;
            ptr=ptr->next;
        }
        if(ptr==NULL)
            return;
        preptr->next = ptr->next;
        free(ptr);
    }
    goto Again;
}
void main(){
    int ch;

    printf("Mantu Kumar Morya\n");
    printf("92201703001\n");
    while(1){
        printf("\n\nSingly Linked List");
        printf("\n1. Create a Linked List");
        printf("\n2. Display a Linked List");
        printf("\n3. Insert a node at the front of Linked List");
        printf("\n4. Insert a node at the end of Linked List");
        printf("\n5. Insert a node at a given position in the linked list");
        printf("\n6. Insert a node such that the linked list is in ascending order.");
        printf("\n7. Delete the first node of the linked list.");
        printf("\n8. Delete the last node of the linked list.");
        printf("\n9. Delete a node before the specified position.");
        printf("\n10. Delete all occurrences of the given value.");
        printf("\n11. Exit");
        printf("\nEnter your choice:");
        scanf("%d",&ch);
        switch(ch){
            case 1: 
            create_list(); 
            break;
            case 2: 
            display();  
            break;
            case 3: 
            printf("Enter a Value:");
                    scanf("%d",&value);
                    insert_front(value);
                    break;
            case 4: 
            printf("Enter a Value:");
                    scanf("%d",&value);
                    insert_end(value);
                    break;
            case 5: 
            printf("Enter a Value:");
                    scanf("%d",&value);
                    insert_pos(value);
                    break;
            case 6: 
            printf("Enter a Value:");
                    scanf("%d",&value);
                    insert_in_sorted(value);
                    break;
            case 7: 
            delete_first();     
            break;
            case 8: 
            delete_last(); 
            break;
            case 9: 
            delete_before_position();    
            break;
            case 10: 
            delete_all_ocurrence();    
            break;
            case 11: 
            exit(0);
            default: 
            printf("Invalid choice");
        }
    }
}
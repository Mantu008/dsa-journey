// #include <stdio.h>
// #include <stdlib.h>

// struct Node {
//     int data;
//     struct Node* next;
// };

// struct Node* top = NULL;

// void push(int value) {
//     struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
//     if (newNode == NULL) {
//         printf("Memory allocation failed. Cannot push.\n");
//         return;
//     }

//     newNode->data = value;
//     newNode->next = top;
//     top = newNode;

//     printf("Pushed %d\n", value);
// }

// void pop() {
//     if (top == NULL) {
//         printf("Stack is empty. Cannot pop.\n");
//         return;
//     }

//     struct Node* temp = top;
//     top = top->next;
//     printf("Popped %d\n", temp->data);
//     free(temp);
// }

// void peep() {
//     if (top == NULL) {
//         printf("Stack is empty.\n");
//         return;
//     }

//     printf("Top element: %d\n", top->data);
// }

// void display() {
//     if (top == NULL) {
//         printf("Stack is empty.\n");
//         return;
//     }

//     printf("Stack elements:\n");
//     struct Node* current = top;
//     while (current != NULL) {
//         printf("%d\n", current->data);
//         current = current->next;
//     }
// }

// void change(int oldValue, int newValue) {
//     if (top == NULL) {
//         printf("Stack is empty. Cannot change.\n");
//         return;
//     }

//     struct Node* current = top;
//     while (current != NULL) {
//         if (current->data == oldValue) {
//             current->data = newValue;
//             printf("Changed %d to %d\n", oldValue, newValue);
//             return;
//         }
//         current = current->next;
//     }

//     printf("%d not found in the stack.\n", oldValue);
// }


// int main(){
//     int choice, value, oldValue, newValue;

//      printf("Mantu Kumar Morya\n");
//      printf("92201703001\n");

//     do {
//         printf("Stack Menu:\n");
//         printf("1. Push\n");
//         printf("2. Pop\n");
//         printf("3. Peep\n");
//         printf("4. Display\n");
//         printf("5. Change\n");
//         printf("6. Exit\n");
//         printf("Enter your choice: ");
//         scanf("%d", &choice);

//         switch (choice) {
//             case 1:
//                 printf("Enter value to push: ");
//                 scanf("%d", &value);
//                 push(value);
//                 break;
//             case 2:
//                 pop();
//                 break;
//             case 3:
//                 peep();
//                 break;
//             case 4:
//                 display();
//                 break;
//             case 5:
//                 printf("Enter old value to change: ");
//                 scanf("%d", &oldValue);
//                 printf("Enter new value: ");
//                 scanf("%d", &newValue);
//                 change(oldValue, newValue);
//                 break;
//             case 6:
//                 printf("Exiting program.\n");
//                 break;
//             default:
//                 printf("Invalid choice. Please choose again.\n");
//         }
//     } while (choice != 6);

//     return 0;
// }


// //Program to implement queue using linked list


#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

struct Node* front = NULL;
struct Node* rear = NULL;

void insert(int value) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed. Cannot insert.\n");
        return;
    }

    newNode->data = value;
    newNode->next = NULL;

    if (front == NULL) {
        front = newNode;
        rear = newNode;
    } else {
        rear->next = newNode;
        rear = newNode;
    }

    printf("Inserted %d\n", value);
}

void delete() {
    if (front == NULL) {
        printf("Queue is empty. Cannot delete.\n");
        return;
    }

    struct Node* temp = front;
    front = front->next;
    printf("Deleted %d\n", temp->data);
    free(temp);
}

void peep() {
    if (front == NULL) {
        printf("Queue is empty.\n");
        return;
    }

    printf("Front element: %d\n", front->data);
}

void display() {
    if (front == NULL) {
        printf("Queue is empty.\n");
        return;
    }

    printf("Queue elements:\n");
    struct Node* current;
        for(current=front;current!=NULL;current = current->next)
    {
        printf("%d\n", current->data);
       
    }
}

void change(int oldValue, int newValue) {
    if (front == NULL) {
        printf("Queue is empty. Cannot change.\n");
        return;
    }

    struct Node* current;
    for(current=front;current!=NULL;current = current->next)
    {
        if (current->data == oldValue) {
            current->data = newValue;
            printf("Changed %d to %d\n", oldValue, newValue);
            return;
        }
       
    }

    printf("%d not found in the queue.\n", oldValue);
}

int main() {
    int choice, value, oldValue, newValue;
    printf("Mantu Kumar Morya\n");
     printf("92201703001\n");

    do {
        printf("Queue Menu:\n");
        printf("1. Insert\n");
        printf("2. Delete\n");
        printf("3. Peep\n");
        printf("4. Display\n");
        printf("5. Change\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter value to insert: ");
                scanf("%d", &value);
                insert(value);
                break;
            case 2:
                delete();
                break;
            case 3:
                peep();
                break;
            case 4:
                display();
                break;
            case 5:
                printf("Enter old value to change: ");
                scanf("%d", &oldValue);
                printf("Enter new value: ");
                scanf("%d", &newValue);
                change(oldValue, newValue);
                break;
            case 6:
                printf("Exiting program.\n");
                break;
            default:
                printf("Invalid choice. Please choose again.\n");
        }
    } while (choice != 6);

    return 0;
}
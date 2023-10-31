#include<stdio.h>
#include<stdlib.h>

struct Node {
    int data;
    struct Node* next;
    struct Node* prev;
};

struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed.\n");
        exit(1);
    }
    newNode->data = data;
    newNode->next = NULL;
    newNode->prev = NULL;
    return newNode;
}

void insertBeginning(struct Node** head, int data) {
    struct Node*  newNode = createNode(data);

    if (*head == NULL) {
        *head = newNode;
        return;
    }

    newNode->next = *head;
    (*head)->prev = newNode;
    *head = newNode;
}

void insertEnd(struct Node** head, int data) {
    struct Node* newNode = createNode(data);
    if (*head == NULL) {
        *head = newNode;
        return;
    }

    struct Node* temp = *head;
    while (temp->next != NULL) {
        temp = temp->next;
    }

    temp->next = newNode;
    newNode->prev = temp;
}

void display(struct Node* head) {
    struct Node* temp = head;
    printf("Doubly linked list: ");
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

void deleteLast(struct Node** head) {
    if (*head == NULL) {
        printf("List is empty. Cannot delete.\n");
        return;
    }

    struct Node* current = *head;

    while (current->next != NULL) {
        current = current->next;
    }

    if (current->prev != NULL) {
        current->prev->next = NULL;
    } else {
        *head = NULL;
    }

    free(current);
}

void deleteBeforePosition(struct Node** head, int data) {
    if (*head == NULL) {
        printf("List is empty. Cannot delete.\n");
        return;
    }

    struct Node* current = *head;
    struct Node* preptr = NULL;

    while (current->next != NULL && current->data != data) {
        preptr = current;
        current = current->next;
    }

    if (current->data == data && preptr != NULL) {
        preptr->prev->next = current;
        current->prev = preptr->prev;
        free(preptr);
    } else {
        printf("Node with data %d not found.\n", data);
    }
}

int main() {
    struct Node* head = NULL;
    int ch, value;
    printf("Name:Mantu Kumar Morya\n Enrollment No:92201703001");

    while(1) {
        printf("\n\nDoubly Linked List\n");
        printf("1. Create a doubly Linked List\n");
        printf("2. Insert at the beginning\n");
        printf("3. Insert at the end\n");
        printf("4. Delete the last node\n");
        printf("5. Delete after sppecified node:\n");
        printf("6. Display a Linked List\n");
        printf("7. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &ch);

        switch(ch) {
            case 1:
                printf("Enter a Value: ");
                scanf("%d", &value);
                insertEnd(&head, value);
            break;
            case 2:
                printf("Enter a Value: ");
                scanf("%d", &value);
                insertBeginning(&head, value);
            break;
            case 3:
                printf("Enter a Value: ");
                scanf("%d", &value);
                insertEnd(&head, value);
                break;
            case 4:
                deleteLast(&head);
            break;
            case 5:
                printf("Enter a Value: ");
                scanf("%d", &value);
                deleteBeforePosition(&head, value);
                break;
            case 6:
                display(head);
                break;
            case 7:
                exit(0);
            default:
                printf("Invalid choice.\n");
        }
    }

    return 0;
}
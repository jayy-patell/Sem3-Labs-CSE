#include<stdio.h>
#include<stdlib.h>

struct Node{
    int data;
    struct Node* next;
};

struct Node* rear = NULL;
struct Node* front = NULL;

void insert(struct Node* ptr, int data){
    if(rear == NULL){
        struct Node* ptr = (struct Node*)malloc(sizeof(struct Node));
        ptr->data = data;
        ptr->next = NULL;
        rear = ptr;
        front = ptr;
    }
    else{
        struct Node* ptr = (struct Node*)malloc(sizeof(struct Node));
        ptr->data = data;
        ptr->next = NULL;
        rear->next = ptr;
        rear = ptr;
    }
}

void delete(struct Node* ptr){
   
    if(front == NULL){
        printf("UNDERFLOW.");
        return;
    }
    else{
        ptr = front;
        front = ptr->next;
        free(ptr);
    }
}

void display(struct Node* ptr){
    ptr=front;
    while(ptr != NULL){
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
    printf("\n");
}

int main(){
    struct Node* head = NULL;
    insert(head ,10);
    insert(head, 20);
    insert(head, 30);
    insert(head, 40);

    display(head);

    delete(head);

    display(head);
    return 0;
}
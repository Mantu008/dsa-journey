#include <stdio.h>
#include <ctype.h>
#define MAX 50

char stack[MAX];
int top = -1;

void push(char ch) {
    if (top < MAX - 1) {
        top++;
        stack[top] = ch;
    } else {
        printf("Stack overflow...\n");
    }
}

char pop() {
    if (top >= 0 && top < MAX) {
        char val = stack[top];
        top--;
        return val;
    } else {
        printf("Stack underflow\n");
        return '\0';
    }
}

int is_operator(char ch) {
    return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
}

int precedence(char ch) {
    if (ch == '+' || ch == '-') {
        return 1;
    } else if (ch == '*' || ch == '/') {
        return 2;
    } else {
        return 0;
    }
}

void infix_to_postfix(const char* infix, char* postfix) {
    int i = 0;
    int j = 0;

    while (infix[i] != '\0') {
        char ch = infix[i];

        if (isalpha(ch) || isdigit(ch)) {
            postfix[j] = ch;
            j++;
        } else if (ch == '(') {
            push(ch);
        } else if (ch == ')') {
            while (top >= 0 && stack[top] != '(') {
                postfix[j] = pop();
                j++;
            }
            // Pop the '(' from the stack
            pop();
        } else if (is_operator(ch)) {
            while (top >= 0 && precedence(stack[top]) >= precedence(ch)) {
                postfix[j] = pop();
                j++;
            }
            push(ch);
        }

        i++;
    }

    // Pop any remaining operators from the stack and append them to the postfix expression.
    while (top >= 0) {
        postfix[j] = pop();
        j++;
    }

    postfix[j] = '\0'; // Null-terminate the postfix expression string.
}

int main() {

    printf("Name:Mantu Kumar Morya\n");
    printf("Enr:92201703001\n");
    char infix[MAX] = {'(', 'A', '+', 'B', ')', '*','(' ,'C', '*', 'D', '-', 'E', ')', '*', 'F', '/', 'G'};
    char postfix[MAX];

    infix_to_postfix(infix, postfix);

    printf("Infix Expression: %s\n", infix);
    printf("Postfix Expression: %s\n", postfix);

    return 0;
}
#include stdio.h>
int main() {
    double a;
    double b;
    char operator;
    double result;

    printf("Welcome to our simple C calculator \n");
    printf("Enter the first number: ");
    scanf("%lf", &a);

    printf("choose the operator from the provided operators (+,-,*,/): ");
    scanf(" %c" , &operator);

    printf("Enter the second number: ");
    scanf("%lf", %b);

    switch (operator) {
        case '+':
            result =a+b;
            printf("The result of %.2lf + %.2lf = %.2lf\n", a, b, result);
            break;
        case '-':
            result = a-b;
            printf("The result of %.2lf - %.2lf = %.2lf\n", a, b, result);
            break;
        case '*':
            reulst = a*b;
            printf("The result of %.2lf * %.2lf = %.2lf\n ", a, b, result);
            break;
        case '/':
            if (b !=0) {
                 result =a/b;
                 printf("The result of %.2lf / %.2lf = %.2lf\n", a, b, result);
            }
            else {
                printf("Error: Division by zero is not allowed.\n");
            }
            break;
        default:
            printf("Error invalid operator");
        
    }
}
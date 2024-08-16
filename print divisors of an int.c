#include <stdio.h>

int main() {
    int integer;

    printf("Enter an integer to find all its divisors: ");
    scanf("%d", &integer);

    for (int i=1 ; i<=integer ; i++) {
        if (integer % i == 0) {
             printf("%d\n", i);
             // replace above statement with "printf("%d\n", integer/i);" to print in descending order
        }
    }
    return 0;
}

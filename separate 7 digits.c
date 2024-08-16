// C program that accepts a seven-digit number, separates the number
// into its individual digits, and prints the digits
// separated from one another by two spaces each.
#include <stdio.h>

int main() {

    int number;
    int remainder[5];

    printf("Enter a number with 7 digits: ");

    while (1) {
        if (scanf("%d", &number) == 1 && number<=9999999 && number>=1000000) {
            break;
        } else {
            while (getchar() != '\n');
            printf("Invalid input, try again: ");
        }
    }

    // separate digits and print
    /* an inefficient algorithm but i was only starting out :)*/
    printf("%d ", number / 1000000);
    remainder[0] = number % 1000000;
    printf("%d ", remainder[0] / 100000);
    remainder[1] = remainder[0] % 100000;
    printf("%d ", remainder[1] / 10000);
    remainder[2] = remainder[1] % 10000;
    printf("%d ", remainder[2] / 1000);
    remainder[3] = remainder[2] % 1000;
    printf("%d ", remainder[3] / 100);
    remainder[4] = remainder[3] % 100;
    printf("%d ", remainder[4] / 10);
    remainder[5] = remainder[4] % 10;
    printf("%d ", remainder[5]);

    // a better algorithm for separating digits and printing
    /* int divisor = 1000000;

    while (divisor >= 1) {
        int digit = number / divisor;
        printf("%d ", digit);
        number %= divisor;
        divisor /= 10;
    }*/

    return 0;
}

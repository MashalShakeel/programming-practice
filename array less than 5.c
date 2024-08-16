// C program to read an array of length 5 and print the position and value of the array elements of value less than 5.
#include <stdio.h>
#define MAX 5

int main() {
    int a[5];

    printf("Enter 5 integers to input into the array\n");

    for (int i=0 ; i<5 ; ++i) {
        printf("[%d]: ", i);
        scanf("%d", &a[i]);
    }

    printf("\nThe position of the element(s) less than 5 is\n");

    for (int i=0 ; i<5 ; ++i) {
        if (a[i] < MAX) {
            printf("[%d]: %d\n", i, a[i]);
        }
    }
    return 0;
}

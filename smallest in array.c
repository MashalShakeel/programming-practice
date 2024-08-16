// C program to read an array of length 6 and find the first occurring smallest element and its position.
#include <stdio.h>

int main() {
    int smallest;
    int a[6];
    int smallestIndex = 0;

    printf("Enter 6 elements of the array\n");

    for (int i=0 ; i<6 ; ++i) {
        printf("[%d]: ", i);
        scanf("%d", &a[i]);
    }

    smallest = a[0];

    for (int i=1 ; i<=6 ; ++i) {
        if (a[i] < smallest) {
            smallest = a[i];
            smallestIndex = i;
        }
    }

    printf("\nThe first occurrence of the smallest element in the array is\n");
    printf("[%d]: %d\n", smallestIndex, smallest);
    return 0;
}


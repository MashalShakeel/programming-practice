// C program to read an array of length 6, change the first element by the last,
// the second element by the fifth and the third element by the fourth.
#include <stdio.h>

// Function to swap elements at positions i and j in the array
void swapElements(int array[], int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

int main() {
    int n;

    printf("Enter the length of the array: ");
    scanf("%d", &n);

    int array[n];

    printf("Enter elements of the array (length %d):\n", n);
    for (int i = 0; i < n; i++) {
        printf("[%d]: ", i);
        scanf("%d", &array[i]);
    }

    // swap specified elements
    for (int i = 0; i < n / 2; i++) {
        swapElements(array, i, n-i-1);
    }

    printf("\nModified array after swapping:\n");
    for (int i = 0; i < n; i++) {
        printf("[%d]: %d\n", i, array[i]);
    }

    return 0;
}


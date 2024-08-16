#include <stdio.h>

int main() {
    int rows = 4;

    // Loop for each row
    for (int i=1 ; i<=rows ; i++) {

        // Print spaces before the stars
        for (int j=1 ; j<=rows-i ; j++) {
            printf(" ");
        }

        // Print stars
        for (int k=1 ; k<=2*i-1 ; k++) {
            printf("*");
        }

        // Move to the next line after printing each row
        printf("\n");
    }

    return 0;
}


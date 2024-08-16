#include <stdio.h>

int main(void) {
    // height and width of the F
    int height;

    // prompt user for input
    printf("This program prints an F using #.\n");
    printf("Enter the height of your F to really let someone know how much you hate them!!\n");
    printf("\nHeight (integer >= 5): ");

    // validate user input for height
    while (1) {
        if (scanf("%d", &height) == 1 && height >= 5) {
            break;
        } else {
            // clear input buffer in case of invalid input
            while (getchar() != '\n');
            printf("Invalid input. Please enter an integer >= 5 for height: ");
        }
    }

    printf("\n");

    // assign values to widths of F
    int width1 = height - 1;
    int width2 = height - 2;

    // print the F
    for (int i = 0; i < width1; i++) {
        printf("#");
    }
    printf("\n");

    for (int i = 0; i < height - 1; i++) {
        // appropriate conditions to make the F look GOOD
        if (height % 2 != 0 && i == (height / 2 - 1)) {
            for (int j = 0; j < width2; j++) {
                printf("#");
            }
            printf("\n");
        } else if (height % 2 == 0 && i == (height / 2 - 2)) {
            for (int j = 0; j < width2; j++) {
                printf("#");
            }
            printf("\n");
        } else {
            printf("#\n");
        }
    }

    return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    // Seed the random number generator with the current time
    srand(time(NULL));

    FILE *file = fopen("rand.dat", "w");

    if (file == NULL) {
        printf("Error opening the file.\n");
        return 1;
    }

    int numRandomNumbers = 50;

    // Write the number of random numbers to the file
    fprintf(file, "%d\n", numRandomNumbers);

    // Generate and write 50 random numbers to the file
    for (int i = 0; i < numRandomNumbers; i++) {
        // Generate a random number between -0.5 and 0.5
        double randomNumber = ((double)rand() / RAND_MAX) - 0.5;

        // Write the random number to the file
        fprintf(file, "%lf\n", randomNumber);
    }

    // Close the file
    fclose(file);

    printf("Random numbers written to rand.dat successfully!!\n");

    return 0;
}

// this program takes first element of an array[5] from user, then prints rest
// of the elements by multiplying each time by 3
#include <stdio.h>

int main() {
    int myArray[5];
    int first;

    printf("Enter first element of the array: ");
    scanf("%d", &first);

    myArray[0] = first;

    for (int i=1 ; i<=5 ; ++i) {
        myArray[i] = myArray[i-1] * 3;
    }

    for (int j=0 ; j<5 ; ++j) {
        printf("[%d]: %d\n", j, myArray[j]);
    }
    return 0;
}

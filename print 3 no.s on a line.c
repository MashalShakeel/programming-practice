// C program to print 3 numbers on a line, starting with 1 and printing n lines.
// Accept the number of lines (n, integer) from the user.
#include <stdio.h>

int main() {
    int n;
    int count = 1;

    printf("Enter an integer: ");
    scanf("%d", &n);

    for (int i=0 ; i<n ; ++i) {
        for (int j=1 ; j<=3 ; ++j) {
            printf("%d ", count++);
        }
        printf("\n");
    }
    return 0;
}

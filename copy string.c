// C program to copy a given string into another
// and count the number of characters copied.

#include <stdio.h>

int stringLength(const char *str) {
    int length = 0;
    while (str[length] != '\0') {
        length++;
    }
    return length;
}

void stringCopy(char *dest, const char *src) {
    int i = 0;
    while (src[i] != '\0') {
        dest[i] = src[i];
        i++;
    }
    dest[i] = '\0';
}

int main() {
    char str1[50];
    char str2[50];
    int lenstr1 = 0;

    printf("Enter a string of characters: ");
    scanf("%[^\n]s", str1);
    // in place of scanset, can also use fgets(str1, sizeof(str1), stdin)

    lenstr1 = stringLength(str1);
    stringCopy(str2, str1);

    printf("Copied string: %s\n", str2);
    printf("Number of characters copied: %d\n", lenstr1);

    return 0;
}

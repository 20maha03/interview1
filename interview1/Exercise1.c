#include <stdio.h>

int main() {
    char firstString[100]; 
    char secondString[100]; 

    printf("Enter the first string: ");
    scanf("%s", firstString);

    printf("Enter the second string: ");
    scanf("%s", secondString);

    int totalLength = 0;
    int i = 0;

    while (firstString[i] != '\0') {
        totalLength++;
        i++;
    }

    i = 0;
    while (secondString[i] != '\0') {
        totalLength++;
        i++;
    }

    char finalString[200]; 
    i = 0;
    while (firstString[i] != '\0') {
        finalString[i] = firstString[i];
        i++;
    }

   
    int j = 0;
    while (secondString[j] != '\0') {
        finalString[i] = secondString[j];
        i++;
        j++;
    }

   
    finalString[i] = '\0';

    printf("Merged String: %s\n", finalString);

    return 0;
}

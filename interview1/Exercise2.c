#include <stdio.h>

int main() {
    int n; 
    printf("Enter the number of elements: ");
    scanf("%d", &n);

   
    int arr[100]; 

    printf("Enter the elements: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int sum = 0;

    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }

    int average = sum / n;

    printf("The average of the array is: %.d\n", average);

    return 0;
}

#include <stdio.h>

int main() {
    int x;
    printf("Enter an integer: ");
    scanf("%d", &x);

    x += 5;
    printf("After += 5, x = %d\n", x);

    x -= 3;
    printf("After -= 3, x = %d\n", x);

    x *= 2;
    printf("After *= 2, x = %d\n", x);

    return 0;
}

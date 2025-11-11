#include <stdio.h>

int main() {
    int a, b;
    printf("Enter two integers: ");
    scanf("%d %d", &a, &b);

    printf("Bitwise AND = %d\n", a & b);
    printf("Bitwise OR  = %d\n", a | b);
    printf("Bitwise XOR = %d\n", a ^ b);

    printf("Binary results:\n");
    printf("a & b = %08b\n", a & b); // Note: %b isn’t standard, so use this just conceptually
    printf("a | b = %08b\n", a | b);
    printf("a ^ b = %08b\n", a ^ b);

    return 0;
}

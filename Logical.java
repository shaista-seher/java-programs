#include <stdio.h>

int main() {
    int age;
    int citizen; // 1 for true, 0 for false

    printf("Enter age: ");
    scanf("%d", &age);
    printf("Are you a citizen? (1 for Yes, 0 for No): ");
    scanf("%d", &citizen);

    if (age >= 18 && citizen == 1)
        printf("You are eligible to vote.\n");
    else
        printf("You are not eligible to vote.\n");

    return 0;
}

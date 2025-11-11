#include <stdio.h>
#include <string.h>

struct Employee {
    char name[50];
    float salary;
};

struct Manager {
    struct Employee emp; 
    char department[50];
};

void displayInfo(struct Manager m) {
    printf("Name: %s\n", m.emp.name);
    printf("Salary: %.2f\n", m.emp.salary);
    printf("Department: %s\n", m.department);
}

int main() {
    struct Manager m;

    strcpy(m.emp.name, "Alice");
    m.emp.salary = 75000.0;
    strcpy(m.department, "Finance");

    printf("Manager Details:\n");
    displayInfo(m);

    return 0;
      }

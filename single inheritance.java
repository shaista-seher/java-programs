class Employee {
    String name;
    double salary;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Alice";
        m.salary = 75000;
        m.department = "Finance";

        System.out.println("Manager Details:");
        m.displayInfo();
    }
}

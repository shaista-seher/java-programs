class Employee {
    String name;
    int salary;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayManagerInfo() {
        displayInfo();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Shaista";
        m.salary = 60000;
        m.department = "IT";

        m.displayManagerInfo();
    }
}

class Employee {
    int salary;
    String name;

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    void setName(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.salary = 50000;
        e.setName("Shaista");

        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}

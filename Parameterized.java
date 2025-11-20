class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        Student s = new Student("Shaista", 16);
        System.out.println("Name: " + s.name + ", Age: " + s.age);
    }
}

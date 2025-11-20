class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Student(Student obj) {
        name = obj.name;
        age = obj.age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Shaista", 16);

        Student s2 = new Student(s1);  // copy constructor called

        System.out.println("Copied Name: " + s2.name + ", Copied Age: " + s2.age);
    }
}

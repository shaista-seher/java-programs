class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name: " + s.name + ", Age: " + s.age);
    }
}

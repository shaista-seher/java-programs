class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    void area() {
        double area = 3.1416 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;
        c.displayShape();
        c.area();

        Rectangle r = new Rectangle();
        r.length = 6;
        r.breadth = 4;
        r.displayShape();
        r.area();
    }
}

class Rectangle extends Shape {
    double length, breadth;

    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

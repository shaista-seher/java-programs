class Rectangle {
    int length;
    int breadth;
    Rectangle() {
        length = 4;
        breadth = 5;
    }
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();        // length=4, breadth=5
        Rectangle r2 = new Rectangle(10, 20);  // custom values

        System.out.println("Default Rectangle: " + r1.length + " x " + r1.breadth);
        System.out.println("Custom Rectangle: " + r2.length + " x " + r2.breadth);
    }
}

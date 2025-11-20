class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    Book(String t, String a) {
        title = t;
        author = a;
        price = 0.0;
    }
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Wings of Fire", "APJ Abdul Kalam");
        Book b3 = new Book("Harry Potter", "J.K. Rowling", 599);

        b1.display();
        b2.display();
        b3.display();
    }
}

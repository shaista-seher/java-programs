class Product {
    int productId;

    // Constructor to set productId
    Product(int productId) {
        this.productId = productId;
    }

    void showDetails() {
        System.out.println("Product ID: " + productId);
    }
}

// Subclass
class Electronics extends Product {
    int warranty; // in years

    // Constructor using super()
    Electronics(int productId, int warranty) {
        super(productId);  // calling parent constructor
        this.warranty = warranty;
    }

    // Overridden method
    @Override
    void showDetails() {
        super.showDetails();  // calling parent method
        System.out.println("Warranty: " + warranty + " years");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Electronics e = new Electronics(101, 2);
        e.showDetails();
    }
}

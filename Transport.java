class Transport {
    void move() {
        System.out.println("Transport can move from one place to another.");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus carries passengers.");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck carries goods.");
    }

    public static void main(String[] args) {
        Bus b = new Bus();
        Truck t = new Truck();

        System.out.println("Bus:");
        b.move();
        b.carryPassengers();

        System.out.println("\nTruck:");
        t.move();
        t.carryGoods();
    }
}

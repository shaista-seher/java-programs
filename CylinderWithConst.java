class CylinderConstr {
    private int radius;
    private int height;

    CylinderConstr(int r, int h) {
        radius = r;
        height = h;
    }

    int getRadius() { return radius; }
    int getHeight() { return height; }
}

class Test {
    public static void main(String[] args) {
        CylinderConstr c = new CylinderConstr(5, 10);

        double volume = Math.PI * c.getRadius() * c.getRadius() * c.getHeight();
        double surfaceArea = 2 * Math.PI * c.getRadius() * (c.getRadius() + c.getHeight());

        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
    }
}

class CylinderCalc {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(5);
        c.setHeight(10);

        double volume = Math.PI * c.getRadius() * c.getRadius() * c.getHeight();
        double surfaceArea = 2 * Math.PI * c.getRadius() * (c.getRadius() + c.getHeight());

        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
    }
}

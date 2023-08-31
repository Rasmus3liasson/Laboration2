public class Circle extends Shape implements PrintValues {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getPerimeter() {
        return Math.PI *(2 * radius) ;
    }

    @Override
    public double printArea() {
        System.out.println("Cirkelns area: " + String.format("%.2f", getArea()));
        return 0;
    }

    @Override
    public double printPerimeter() {
        System.out.println("Cirkelns omkrets: " + String.format("%.2f", getPerimeter()));
        return 0;
    }
}

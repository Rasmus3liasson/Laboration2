public class Triangle extends Shape implements PrintValues {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea() {
        return side1 * side2 / 2;
    }

    public double getPerimeter() {
        return side1 + side2+ side3;
    }

    @Override
    public double printArea() {
        System.out.println("Triangelns area: " + String.format("%.2f", getArea()));
        return 0;
    }

    @Override
    public double printPerimeter() {
        System.out.println("Triangelns omkrets: " + String.format("%.2f", getPerimeter()));
        return 0;
    }
}

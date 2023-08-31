public class Rectangle extends Shape implements PrintValues {
   private double witdh;
   private double height;

    public Rectangle(double witdh, double height) {
        this.witdh = witdh;
        this.height = height;
    }
    public double getArea() {
        return witdh * height;
    }


    public double getPerimeter() {
        return 2 * (witdh + height);
    }

    @Override
    public double printArea() {
        System.out.println("Rektangelns area: " + String.format("%.2f", getArea()));
        return 0;
    }

    @Override
    public double printPerimeter() {
        System.out.println("Rektangelns omkrets: " + String.format("%.2f", getPerimeter()));
        return 0;
    }
}

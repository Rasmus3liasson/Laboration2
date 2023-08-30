public class Rectangle extends Shape {
   private double witdh;
   private double height;

    public Rectangle(double witdh, double height) {
        this.witdh = witdh;
        this.height = height;
    }

    public double getWitdh() {
        return witdh;
    }

    public void setWitdh(double witdh) {
        this.witdh = witdh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return witdh * height;
    }


    public double getPerimeter() {
        return 2 * (witdh + height);
    }
}

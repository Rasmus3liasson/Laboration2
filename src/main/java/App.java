public class App {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(2,3,4);


        double rectangleArea = rectangle.getArea();
        double rectanglePerimeter = rectangle.getPerimeter();
        double circleArea = circle.getArea();
        double circlePerimeter = circle.getPerimeter();
        double triangleArea = triangle.getArea();
        double trianglePerimeter = triangle.getPerimeter();


        System.out.println("\nRektangels area: " + String.format("%.2f",rectangleArea) );
        System.out.println("\nRektangels omkrets: " + String.format("%.2f",rectanglePerimeter));
        System.out.println("\nCirkelns area: " +  String.format("%.2f", circleArea));
        System.out.println("\nCirkelns omkrets: " + String.format("%.2f", circlePerimeter));
        System.out.println("\nTriangelns area: " +  String.format("%.2f", triangleArea));
        System.out.println("\nTriangelns omkrets: " + String.format("%.2f", trianglePerimeter));


    }

}


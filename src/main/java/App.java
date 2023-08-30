public class App {
    public static void main(String[] args) {
        // Creating a rectangle
        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(3);


        double rectangleArea = rectangle.getArea();
        double rectanglePerimeter = rectangle.getPerimeter();
        double circleArea = circle.getArea();
        double circlePerimeter = circle.getPerimeter();


        System.out.println("\nRektangels area: " + rectangleArea);
        System.out.println("\nRektangels omkrets: " + rectanglePerimeter);
        System.out.println("\ncirkelns area: " +  String.format("%.2f", circleArea));
        System.out.println("\ncirkelns omkrets: " + String.format("%.2f", circlePerimeter));


    }

}


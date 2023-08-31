import java.util.*;

public class App {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(2,3,4);
        Triangle duplicatedTriangle = new Triangle(2,3,4);


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


        Shape[] shapesArr = {rectangle, circle, triangle, duplicatedTriangle};
        ArrayList <Shape> shapesList = new ArrayList<>(List.of(shapesArr));
        Collections.sort(shapesList);

        // Using LinkedHashSet to keep the order
        Set<Shape> shapeCollections = new LinkedHashSet<>(shapesList);

        System.out.println("\nSorterad Ordning baserat på Area:");
        System.out.println("");
        for (Shape shapeArea : shapeCollections) {
            System.out.println("Area: " + shapeArea.getArea());
        }

    }
}


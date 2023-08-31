import java.util.*;

public class App {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(2,3,4);
        Triangle duplicatedTriangle = new Triangle(2,3,4);


        rectangle.printArea();
        rectangle.printPerimeter();
        circle.printArea();
        circle.printPerimeter();
        triangle.printArea();
        triangle.printPerimeter();

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


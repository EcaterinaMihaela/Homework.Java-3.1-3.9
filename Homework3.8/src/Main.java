// Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(2, 5));
        shapes.add(new Square(4));

        AreaCalculator calculator = new AreaCalculator();
        double total = calculator.calculateTotalArea(shapes);

        System.out.println("Total Area: " + total);
    }
}
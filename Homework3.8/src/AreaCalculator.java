// Dependency Inversion Principle (DIP) - High-level module depends on abstractions (Shape), not on concrete classes
// AreaCalculator.java
import java.util.List;

public class AreaCalculator {
    public double calculateTotalArea(List<Shape> shapes) {
        return shapes.stream().mapToDouble(Shape::getArea).sum();
    }
}
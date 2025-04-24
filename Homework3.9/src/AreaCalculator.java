// AreaCalculator.java
// DIP (depends on abstraction: Shape, not concrete classes)
import java.util.List;

public class AreaCalculator {
    public double calculateTotalArea(List<Shape> shapes) {
        return shapes.stream().mapToDouble(Shape::getArea).sum();
    }
}
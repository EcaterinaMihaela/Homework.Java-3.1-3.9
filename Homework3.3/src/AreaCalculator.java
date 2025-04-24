import java.util.List;

public class AreaCalculator {
    public static double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            System.out.println("Area " + shape.getClass().getSimpleName() + ": " + shape.getArea());
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

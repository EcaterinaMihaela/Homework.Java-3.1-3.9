import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapesList = new ArrayList<>();
        shapesList.add(new Circle(2));
        shapesList.add(new Rectangle(1, 3));
        shapesList.add(new Circle(1));

        double totalArea = AreaCalculator.calculateTotalArea(shapesList);

        System.out.println("Total Area: " + totalArea);
    }
}

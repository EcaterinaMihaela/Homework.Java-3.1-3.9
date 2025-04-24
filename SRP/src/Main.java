public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 6);
        int perimeter = rect.calculatePerimeter();

        PrintHelper.printPerimeter(perimeter);
    }
}

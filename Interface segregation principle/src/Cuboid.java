class Cuboid implements ShapeInterface, ThreeDimensionalShapeInterface,ManageShapeInterface {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }

    @Override
    public double calculate() {
        // Apelarea metodei area()
        return area();
    }
}

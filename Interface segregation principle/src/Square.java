class Square implements ShapeInterface, ManageShapeInterface {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        // Aria pătratului: latura^2
        return side * side;
    }

    @Override
    public double calculate() {
        // Apelarea metodei area()
        return area();
    }
}

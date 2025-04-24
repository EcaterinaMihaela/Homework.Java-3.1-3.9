// Liskov Substitution Principle (LSP)
// Square.java - can be used anywhere Rectangle is expected (because it behaves like a rectangle)
//clasa de baza cat mai generala
public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}
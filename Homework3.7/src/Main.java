import java.util.*;

public class Main {
    public static void main(String[] args) {
        CoffeLover lover = new CoffeLover();
        lover.addCoffeMachine(new SimpleCoffeMachine());
        lover.addCoffeMachine(new ComplexCoffeMachine());

        lover.makeCoffe();
    }
}
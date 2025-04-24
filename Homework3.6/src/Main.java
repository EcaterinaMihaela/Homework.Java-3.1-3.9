import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<CoffeMachine> machines = new ArrayList<>();
        machines.add(new SimpleCoffeMachine());
        machines.add(new ComplexCoffeMachine());

        CoffeLover lover = new CoffeLover(machines);
        lover.makeCoffe();
    }
}
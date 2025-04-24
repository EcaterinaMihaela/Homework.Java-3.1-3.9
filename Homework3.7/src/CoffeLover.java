import java.util.ArrayList;
import java.util.List;

public class CoffeLover {
    private List<CoffeMachine> coffeMachines = new ArrayList<>();

    public void addCoffeMachine(CoffeMachine machine) {
        coffeMachines.add(machine);
    }

    public void makeCoffe() {
        coffeMachines.forEach(CoffeMachine::start);
    }
}

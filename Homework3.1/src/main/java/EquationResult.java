public class EquationResult {
    private String type;
    private Object solution;

    public EquationResult(String type, Object solution) {
        this.type = type;
        this.solution = solution;
    }

    public String getType() {
        return type;
    }

    public Object getSolution() {
        return solution;
    }
}


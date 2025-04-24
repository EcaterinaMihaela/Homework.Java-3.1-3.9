public class EquationSolver {
    private double a;
    private double b;

    public EquationSolver(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public EquationResult solve() {
        if (a == 0 && b == 0) {
            return new EquationResult("identical", "infinite solutions");
        } else if (a == 0) {
            return new EquationResult("impossible", "no solution");
        } else {
            double x = -b / a;
            return new EquationResult("determined", x);
        }
    }
}

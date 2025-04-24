public class Main {
    public static void main(String[] args) {
        EquationSolver solver = new EquationSolver(2, -4);
        EquationResult result = solver.solve();

        PrintHelper.print(result);
        JsonHelper.saveToJson(result, "result.json");
    }
}

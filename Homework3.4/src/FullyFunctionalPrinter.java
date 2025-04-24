public class FullyFunctionalPrinter implements MultifunctionalPrinter {

    @Override
    public void print() {
        System.out.println("FullyFunctionalPrinter: Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("FullyFunctionalPrinter: Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("FullyFunctionalPrinter: Sending fax...");
    }
}

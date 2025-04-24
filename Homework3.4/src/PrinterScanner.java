public class PrinterScanner implements Printer, Scanner {
    @Override
    public void print() {
        System.out.println("PrinterScanner: Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("PrinterScanner: Scanning document...");
    }
}

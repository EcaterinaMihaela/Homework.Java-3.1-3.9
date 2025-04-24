public class Main {
    public static void main(String[] args) {

        // Simple printer usage
        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print();

        // Printer and scanner usage
        PrinterScanner printerScanner = new PrinterScanner();
        printerScanner.print();
        printerScanner.scan();

        // Multifunction printer
        MultifunctionalPrinter mfp = new FullyFunctionalPrinter();
        mfp.print();
        mfp.scan();
        mfp.fax();
    }
}

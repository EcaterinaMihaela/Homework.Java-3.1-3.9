public class DemoApp {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        ElectronicPayment creditCard = new CreditCardPayment();  //creeaza argumentul electronicPayment ca obieect pe care l
        // paseaza metodei processElectronicPayment
        processor.processElectronicPayment(creditCard, 150.0);

        CashPayment cash = new CashPayment();
        processor.acceptCash(cash);
    }
}

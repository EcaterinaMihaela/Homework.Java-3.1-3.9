class CreditCardPayment extends ElectronicPayment {
    @Override
    public void validate() {
        System.out.println("Validating credit card...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
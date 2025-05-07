class PayPalPayment extends ElectronicPayment {
    @Override
    public void validate() {
        System.out.println("Validating PayPal account...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
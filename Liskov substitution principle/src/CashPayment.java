class CashPayment extends PaymentMethod {
    @Override
    public void validate() {
        System.out.println("Checking if cash is acceptable...");
    }

    public void handOverCash() {
        System.out.println("Customer hands over cash.");
    }
}
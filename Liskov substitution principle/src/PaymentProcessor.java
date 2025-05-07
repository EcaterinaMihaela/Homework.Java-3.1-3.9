public class PaymentProcessor {
    public void processElectronicPayment(ElectronicPayment method, double amount) {
        method.validate();
        method.processPayment(amount);
    }

    public void acceptCash(CashPayment method) {
        method.validate();
        method.handOverCash();
    }
}
//clasa care controleaza si manageriaza păltiile numerar si electoronice
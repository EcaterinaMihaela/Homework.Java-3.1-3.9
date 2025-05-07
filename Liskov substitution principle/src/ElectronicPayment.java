abstract class ElectronicPayment extends PaymentMethod {
    public abstract void processPayment(double amount);   //clasa fol pt plata electronica
}
//clasa extinde metoda de plata de baza(cash) prin metoda de procesare specifica platei electonice
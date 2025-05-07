abstract class PaymentMethod {
    public abstract void validate();  //clasa fol pt plata cu cash
}
//daca puneam si metoda processPayment aici si folosim paymentMethod ca clasa de baza de la care sa extindem
// processPayment era specifica doar pt plata cu cardul
//nu si pentru plata cu cash,ceea ce incalca principiul
//de aceea trb clase separate ca sa nu arunce exceptie

//principiu:clasele derivate treb sa poata inlocui clasa de baza fara a se altera
//ex:pasarile zboara ,strutul e pasare dar nu poate zbura --facem clasele mai explicite--pasari zburztoare ext pasari
//daca am o clasa pasare cu metodele eat si walk e SI ul intre ele deci incalca si si ul
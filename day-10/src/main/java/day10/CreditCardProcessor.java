package day10;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println(
                "Addebito di " + amount + " EURO su carta di credito"
        );
    }
}

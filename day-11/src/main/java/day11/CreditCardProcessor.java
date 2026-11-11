package day11;

public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println(
                "Addebito di " + amount + " euro su carta di credito"
        );
    }
}

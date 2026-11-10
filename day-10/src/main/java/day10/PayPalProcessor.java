package day10;




public class PayPalProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {

        System.out.println(
                "Pagamento di " + amount + " EUR tramite PayPal"
        );
    }
}
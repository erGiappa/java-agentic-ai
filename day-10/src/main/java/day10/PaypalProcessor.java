package day10;

public class PaypalProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount){
        System.out.println(
                "Pagamento di " + amount + " euro tramite Paypal"
        );
    }
}

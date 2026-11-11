package day11;

import org.springframework.stereotype.Component;

@Component
public class PayPalProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println(
                "Elaborazione pagamento di " + amount + " euro via paypal."
        );
    }
}

package day10;

public class PaymentService {

    public void makePayment(double amount) {

        CreditCardProcessor processor = new CreditCardProcessor();

        processor.processPayment(100);
    }
}

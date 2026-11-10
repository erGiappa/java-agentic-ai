package day10;

public class RefundService {

    private PaymentProcessor processor;

    public RefundService(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void refund(double amount) {

        System.out.println(
                "Richiesta rimborso di " + amount + " EUR"
        );
    }
}

package day10;

public class PaymentService {

    private PaymentProcessor processor;
    private TransactionLogger logger;

    public PaymentService(PaymentProcessor processor, TransactionLogger logger) {
        this.processor = processor;
        this.logger = logger;
    }

    public void makePayment(double amount) {
        processor.processPayment(amount);
        logger.logTransaction(amount);
    }
}

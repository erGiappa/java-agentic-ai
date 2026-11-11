package day11;

import org.springframework.beans.factory.annotation.Qualifier;

public class PaymentService {

    private final PaymentProcessor processor;
    private final TransactionLogger logger;

    public PaymentService(
            @Qualifier("creditCardProcessor") PaymentProcessor processor,
            TransactionLogger logger) {

        this.processor = processor;
        this.logger = logger;
    }

    public void makePayment(double amount) {

        logger.log("Avvio pagamento di " + amount + " EUR");

        processor.processPayment(amount);

        logger.log("Pagamento completato");
    }
}

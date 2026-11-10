
package day10;

public class PaymentService {

    private PaymentProcessor processor;
    private TransactionLogger logger;

    public PaymentService(PaymentProcessor processor, TransactionLogger logger) {
        this.processor = processor;
        this.logger = logger;
    }

    // Metodo eseguito automaticamente alla creazione
    public void initialize() {
        System.out.println("PaymentService inizializzato!");
    }

    public void makePayment(double amount) {
        processor.processPayment(amount);
        logger.logTransaction(amount);
    }

    // Metodo eseguito alla chiusura del container
    public void shutdown() {
        System.out.println("PaymentService chiuso!");
    }
}

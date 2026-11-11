package day11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private final PaymentProcessor processor;
    private final TransactionLogger logger;

    @Autowired
    public PaymentService(
            @Qualifier("creditCardProcessor") PaymentProcessor processor,
            TransactionLogger logger) {

        this.processor = processor;
        this.logger = logger;
    }

    @PostConstruct
    public void init() {
        System.out.println("PaymentService inizializzato");
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("Chiusura del servizio");
    }

    public void makePayment(double amount) {

        logger.log("Avvio pagamento di " + amount + " EUR");

        processor.processPayment(amount);

        logger.log("Pagamento completato");
    }
}

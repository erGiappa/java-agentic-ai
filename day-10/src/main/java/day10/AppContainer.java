package day10;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class AppContainer implements AutoCloseable {

    private Map<String, Object> beans = new HashMap<>();

    private String processorType;
    private boolean closed = false;

    // Legge la configurazione dal file
    public AppContainer() {

        Properties properties = new Properties();

        try (InputStream input = AppContainer.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {

            if (input == null) {
                throw new RuntimeException(
                        "File config.properties non trovato!"
                );
            }

            properties.load(input);

            processorType = properties.getProperty(
                    "payment.processor"
            );

            if (processorType == null || processorType.isBlank()) {
                throw new RuntimeException(
                        "Processore non specificato nel file di configurazione"
                );
            }

        } catch (IOException e) {
            throw new RuntimeException(
                    "Errore nella lettura del file di configurazione", e
            );
        }
    }

    // Crea o recupera il processore
    public PaymentProcessor createProcessor() {

        if (beans.containsKey("paymentProcessor")) {
            return (PaymentProcessor) beans.get("paymentProcessor");
        }

        PaymentProcessor processor;

        if (processorType.equalsIgnoreCase("paypal")) {

            processor = new PayPalProcessor();

        } else if (processorType.equalsIgnoreCase("creditcard")) {

            processor = new CreditCardProcessor();

        } else {

            throw new IllegalArgumentException(
                    "Processore non riconosciuto: " + processorType
            );
        }

        beans.put("paymentProcessor", processor);

        return processor;
    }

    // Crea o recupera il logger
    public TransactionLogger createLogger() {

        if (beans.containsKey("transactionLogger")) {
            return (TransactionLogger) beans.get("transactionLogger");
        }

        TransactionLogger logger = new TransactionLogger();

        beans.put("transactionLogger", logger);

        return logger;
    }

    // Crea o recupera PaymentService
    public PaymentService createPaymentService() {

        if (beans.containsKey("paymentService")) {
            return (PaymentService) beans.get("paymentService");
        }

        PaymentService service = new PaymentService(
                createProcessor(),
                createLogger()
        );

        beans.put("paymentService", service);

        // Inizializzazione automatica del servizio
        service.initialize();

        return service;
    }

    // Crea o recupera RefundService
    public RefundService createRefundService() {

        if (beans.containsKey("refundService")) {
            return (RefundService) beans.get("refundService");
        }

        RefundService service = new RefundService(createProcessor());

        beans.put("refundService", service);

        return service;
    }

    // Recupera un bean tramite nome
    public Object getBean(String name) {
        return beans.get(name);
    }

    // Recupera un bean tramite tipo
    public <T> T getBean(Class<T> type) {

        for (Object bean : beans.values()) {

            if (type.isInstance(bean)) {
                return type.cast(bean);
            }
        }

        if (type == PaymentService.class) {
            return type.cast(createPaymentService());
        }

        if (type == RefundService.class) {
            return type.cast(createRefundService());
        }

        if (type == PaymentProcessor.class) {
            return type.cast(createProcessor());
        }

        if (type == TransactionLogger.class) {
            return type.cast(createLogger());
        }

        throw new RuntimeException(
                "Bean non trovato: " + type.getName()
        );
    }

    // Chiusura del container
    @Override
    public void close() {

        if (!closed) {

            PaymentService service =
                    (PaymentService) beans.get("paymentService");

            if (service != null) {
                service.shutdown();
            }

            closed = true;

            System.out.println("Container chiuso.");
        }
    }
}

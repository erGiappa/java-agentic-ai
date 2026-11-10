package day10;

import java.util.HashMap;
import java.util.Map;


public class AppContainer {

    private Map<String, Object> beans = new HashMap<>();

    private String processorType;

    public AppContainer(String processorType) {
        this.processorType = processorType;
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
}
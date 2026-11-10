package day10;

public class AppContainer {

    private boolean usePayPal;

    public AppContainer(boolean usePayPal) {
        this.usePayPal = usePayPal;
    }

    public PaymentProcessor createProcessor() {
        if (usePayPal) {
            return new PaypalProcessor();
        } else {
            return new CreditCardProcessor();
        }
    }
    public PaymentService createPaymentService() {
        return new PaymentService(createProcessor());
    }
}
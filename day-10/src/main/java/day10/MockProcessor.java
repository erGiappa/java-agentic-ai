package day10;

public class MockProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount){
        System.out.println("Simulazione pagamento");
    }
}

package day10;


public class Main {

    public static void main(String[] args) {

        PaymentProcessor mock = new MockProcessor();

        PaymentService service = new PaymentService(mock);

        service.makePayment(100);
    }
}

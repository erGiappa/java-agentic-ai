package day11;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor creditCard = new CreditCardProcessor();

        PaymentService service = new PaymentService(creditCard);

        service.makePayment(250);
    }
}

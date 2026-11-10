
package day10;

public class Main {

    public static void main(String[] args) {

        try (AppContainer container = new AppContainer()) {

            PaymentService payment =
                    container.getBean(PaymentService.class);

            RefundService refund =
                    container.getBean(RefundService.class);

            payment.makePayment(100);

            refund.refund(50);

            // Verifica che il processore sia condiviso
            PaymentProcessor p1 = container.createProcessor();
            PaymentProcessor p2 = container.createProcessor();

            System.out.println("Processore condiviso: " + (p1 == p2));

        }


    }
}

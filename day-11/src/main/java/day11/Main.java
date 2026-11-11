package day11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Avvio del container Spring
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Recupero del Bean PaymentService
        PaymentService service =
                context.getBean(PaymentService.class);

        // Elaborazione del pagamento
        service.makePayment(150);

        // Chiusura del container
        context.close();
    }
}

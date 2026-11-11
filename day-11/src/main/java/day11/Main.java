package day11;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentService service =
                context.getBean(PaymentService.class);

        service.makePayment(150);

        context.close();
    }
}

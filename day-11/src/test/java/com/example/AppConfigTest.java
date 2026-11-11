package com.example;



import day11.AppConfig;
import day11.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppConfigTest {

    @Test
    public void testPaymentServiceBean() {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        PaymentService service =
                context.getBean(PaymentService.class);

        assertNotNull(service);

        context.close();
    }
}
package day11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PaymentProcessor paymentProcessor() {
        return new CreditCardProcessor();
    }

    @Bean
    public PaymentService paymentService() {
        return new PaymentService(paymentProcessor());
    }

}
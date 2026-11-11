package day11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    public PaymentProcessor payPalProcessor() {
        return new PayPalProcessor();
    }

    @Bean
    public PaymentProcessor creditCardProcessor() {
        return new CreditCardProcessor();
    }

    @Bean
    public TransactionLogger transactionLogger() {
        return new TransactionLogger();
    }

    @Bean
    public PaymentService paymentService(
            @Qualifier("creditCardProcessor") PaymentProcessor processor,
            TransactionLogger logger) {

        return new PaymentService(processor, logger);
    }

}
package day11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "day11")
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

}
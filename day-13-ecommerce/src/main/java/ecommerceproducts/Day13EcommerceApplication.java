package ecommerceproducts;

import ecommerceproducts.model.Prodotto;
import ecommerceproducts.repository.ProdottoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class Day13EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day13EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner testProdotto(ProdottoRepository repository) {
        return args -> {

            Prodotto prodotto = new Prodotto();

            prodotto.setNome("MacBook Air");
            prodotto.setDescrizione("Laptop Apple M4");
            prodotto.setPrezzo(new BigDecimal("1299.99"));
            prodotto.setQuantitaDisponibile(10);

            repository.save(prodotto);

            System.out.println("Prodotto salvato");
            System.out.println("ID: " + prodotto.getId());
            System.out.println("Data creazione: " + prodotto.getDataCreazione());
            System.out.println("Ultimo aggiornamento: " + prodotto.getDataUltimoAggiornamento());
        };
    }

}

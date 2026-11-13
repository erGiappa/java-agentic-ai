package ecommerceproducts;

import ecommerceproducts.model.Prodotto;
import ecommerceproducts.repository.ProdottoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
public class Day13EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day13EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner testProdotto(ProdottoRepository repository) {
        return args -> {

            // Inseriamo dati solo se il database è vuoto
            if (repository.count() == 0) {

                Prodotto p1 = new Prodotto();
                p1.setNome("MacBook Air");
                p1.setDescrizione("Laptop Apple");
                p1.setPrezzo(new BigDecimal("1299.99"));
                p1.setQuantitaDisponibile(10);

                Prodotto p2 = new Prodotto();
                p2.setNome("iPhone 17");
                p2.setDescrizione("Smartphone Apple");
                p2.setPrezzo(new BigDecimal("999.99"));
                p2.setQuantitaDisponibile(15);

                Prodotto p3 = new Prodotto();
                p3.setNome("Samsung Galaxy");
                p3.setDescrizione("Smartphone Samsung");
                p3.setPrezzo(new BigDecimal("799.99"));
                p3.setQuantitaDisponibile(20);

                repository.saveAll(List.of(p1, p2, p3));

                System.out.println("Prodotti inseriti!");
            }

            // Recuperiamo tutti i prodotti
            List<Prodotto> prodotti = repository.findAll();

            System.out.println("ELENCO PRODOTTI:");

            for (Prodotto prodotto : prodotti) {
                System.out.println(
                        prodotto.getId() + " - " +
                                prodotto.getNome() + " - " +
                                prodotto.getPrezzo()
                );
            }

            // Test del metodo personalizzato
            List<Prodotto> risultati =
                    repository.findByNome("MacBook Air");

            System.out.println("RICERCA MACBOOK AIR:");

            risultati.forEach(p ->
                    System.out.println(p.getNome() + " - " + p.getPrezzo())
            );
            // Test aggiornamento prodotto
            Prodotto prodottoDaModificare =
                    repository.findByNome("MacBook Air").get(0);

            prodottoDaModificare.setPrezzo(new BigDecimal("1199.99"));

            repository.save(prodottoDaModificare);

            System.out.println("PRODOTTO AGGIORNATO!");
            System.out.println("Nuovo prezzo: " + prodottoDaModificare.getPrezzo());
            System.out.println("Ultimo aggiornamento: " +
                    prodottoDaModificare.getDataUltimoAggiornamento());
        };
    }
}

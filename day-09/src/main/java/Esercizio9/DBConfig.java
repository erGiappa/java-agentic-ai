import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class DBConfig {

    private static Properties prop = new Properties();

    // Caricamento automatico del file properties
    static {
        try (InputStream file =
                     DBConfig.class.getResourceAsStream("/db.properties")) {

            if (file == null) {
                throw new IOException("File db.properties non trovato!");
            }

            prop.load(file);

        } catch (IOException e) {
            throw new RuntimeException("Errore nel caricamento del file", e);
        }
    }

    // Metodo per recuperare l'URL
    public static String getUrl() {
        return prop.getProperty("url");
    }

    // Metodo per recuperare l'utente
    public static String getUser() {
        return prop.getProperty("user");
    }

    // Metodo per recuperare la password
    public static String getPassword() {
        return prop.getProperty("password");
    }
}
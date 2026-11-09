import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Esercizio9 {

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(
                DBConfig.getUrl(),
                DBConfig.getUser(),
                DBConfig.getPassword())) {

            System.out.println("Connessione riuscita!");

        } catch (SQLException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
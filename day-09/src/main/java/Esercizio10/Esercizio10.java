import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Esercizio10 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";
        String user = "root";
        String password = "JDBC1234!";

        try {

            // Caricamento esplicito del driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver caricato correttamente!");

            try (Connection conn =
                         DriverManager.getConnection(url, user, password)) {

                System.out.println("Connessione riuscita!");

            }

        } catch (ClassNotFoundException e) {

            System.out.println("Driver JDBC non trovato!");

        } catch (SQLException e) {

            System.out.println("Errore SQL: " + e.getMessage());

        }
    }
}

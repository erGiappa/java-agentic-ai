package Modulo2;

import java.sql.*;

public class Esercizio18 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";


        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             Statement stmt = conn.createStatement()) {

            // Tabella inesistente: genera un errore SQL.
            stmt.executeQuery("SELECT * FROM tabella_inesistente");

        } catch (SQLException e) {

            System.out.println("Messaggio: " + e.getMessage());

            System.out.println("Codice errore: "
                    + e.getErrorCode());

            System.out.println("SQL State: "
                    + e.getSQLState());
        }
    }
}

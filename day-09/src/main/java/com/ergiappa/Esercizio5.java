package com.ergiappa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Esercizio5 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";
        String user = "root";
        String password = "JDBC1234!";

        try (Connection c = DriverManager.getConnection(url, user, password)) {

            System.out.println("Connessione aperta correttamente!");

        } catch (SQLException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        // La connessione viene chiusa automaticamente
        // anche se si verifica un errore.
    }
}

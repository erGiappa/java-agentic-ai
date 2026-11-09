package com.ergiappa;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class Esercizio8 {
    public static void main(String[] args) {

        Properties prop = new Properties();

        try {
            // Legge il file di configurazione
            InputStream file = Esercizio8.class.getResourceAsStream("/db.properties");

            prop.load(file);
            file.close();

            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");

            // Connessione al database
            try (Connection conn =
                         DriverManager.getConnection(url, user, password)) {

                System.out.println("Connessione riuscita!");

            }

        } catch (IOException | SQLException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
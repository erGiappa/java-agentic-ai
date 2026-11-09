package com.ergiappa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ConnectionTest {

    public static void main(String[] args) {

        // Indirizzo del database MySQL
        String url = "jdbc:mysql://localhost:3308/blogdb";

        // Credenziali MySQL
        String user = "root";
        String password = "JDBC1234!";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            if (!conn.isClosed()) {
                System.out.println("Connessione riuscita");
            }

            conn.close();

        } catch (SQLException e) {
            System.out.println("Errore di connessione: " + e.getMessage());
        }
    }
}
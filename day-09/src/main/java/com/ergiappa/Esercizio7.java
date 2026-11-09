package com.ergiappa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Esercizio7 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";
        String user = "root";
        String password = "passwordSbagliata";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            System.out.println("Connessione riuscita!");

        } catch (SQLException e) {

            System.out.println("Errore di connessione!");
            System.out.println("Messaggio: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());

        }
    }
}

package com.ergiappa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class Esercizio6 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";
        String user = "root";
        String password = "JDBC1234!";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            DatabaseMetaData meta = conn.getMetaData();

            System.out.println("Nome driver: " +
                    meta.getDriverName());

            System.out.println("Versione driver: " +
                    meta.getDriverVersion());

        } catch (SQLException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}

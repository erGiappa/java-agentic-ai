package Modulo2;

import java.sql.*;

public class Esercizio13 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             Statement stmt = conn.createStatement()) {

            // L'apostrofo in O'Connor interrompe la stringa SQL.
            // La query genera un errore di sintassi.
            String sql = "INSERT INTO autori(nome, email) " +
                    "VALUES ('O'Connor', 'oconnor@email.com')";

            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println("Errore SQL: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
        }
    }
}

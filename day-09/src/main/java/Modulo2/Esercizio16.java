package Modulo2;

import java.sql.*;

public class Esercizio16 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             Statement stmt = conn.createStatement()) {

            String sql = "UPDATE autori " +
                    "SET email='nuovo@example.com' " +
                    "WHERE autore_id=1";

            int righe = stmt.executeUpdate(sql);

            System.out.println("Record modificati: " + righe);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

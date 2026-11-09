package Modulo3;

import java.sql.*;

public class Esercizio26 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        String sql = "SELECT * FROM utenti WHERE password = ?";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             PreparedStatement ps = conn.prepareStatement(sql)) {

            String password = "' OR '1'='1";

            ps.setString(1, password);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    System.out.println("Utente trovato.");
                } else {
                    System.out.println("Login non riuscito.");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

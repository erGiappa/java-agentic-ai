package Modulo3;

import java.sql.*;

public class Esercizio29 {

    public static boolean checkLogin(String u, String p) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        String sql = "SELECT * FROM utenti WHERE username=? AND password=?";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, u);
            ps.setString(2, p);

            try (ResultSet rs = ps.executeQuery()) {

                return rs.next();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {

        if (checkLogin("mario", "1234")) {
            System.out.println("Login effettuato!");
        } else {
            System.out.println("Credenziali errate!");
        }
    }
}

package Modulo3;

import java.sql.*;

public class Esercizio25 {
    public static void main(String[] args) {

    String url = "jdbc:mysql://localhost:3308/blogdb";

    String sql = "SELECT * FROM autori WHERE email LIKE ?";

    try(
    Connection conn =
            DriverManager.getConnection(url, "root", "JDBC1234!");
    PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, "%example.com");

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                System.out.println(
                        rs.getString("nome") + " - " +
                                rs.getString("email"));
            }
        }

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}
}

package Modulo3;

import java.sql.*;

public class Esercizio24 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3308/blogdb";

        String sql = "DELETE FROM autori WHERE email=?";

        try (Connection conn = DriverManager.getConnection(url, "root", "JDBC1234!");
        PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, "ada@email.com");

            int righe = ps.executeUpdate();

            System.out.println("Record eliminati: " + righe);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

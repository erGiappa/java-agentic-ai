package Modulo2;

import java.sql.*;

public class Esercizio17 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             Statement stmt = conn.createStatement()) {

            String sql = "DELETE FROM autori WHERE autore_id = 3";

            int righe = stmt.executeUpdate(sql);

            System.out.println("Record eliminati: " + righe);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

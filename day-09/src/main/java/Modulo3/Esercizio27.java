package Modulo3;
import java.sql.*;

public class Esercizio27 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        String sql = "INSERT INTO autori(nome, email) VALUES (?, ?)";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "John");
            ps.setString(2, "john@example.com");
            ps.addBatch();

            ps.setString(1, "Michael");
            ps.setString(2, "michael@example.com");
            ps.addBatch();

            ps.setString(1, "John Michael");
            ps.setString(2, "johnmichael@example.com");
            ps.addBatch();

            int[] risultati = ps.executeBatch();

            System.out.println("Operazioni eseguite: "
                    + risultati.length);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

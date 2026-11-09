import java.sql.*;

public class Esercizio30 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        String sql = "INSERT INTO autori(nome, email) VALUES (?, ?)";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             PreparedStatement ps = conn.prepareStatement(sql)) {

            for (int i = 1; i <= 5; i++) {

                ps.setString(1, "Autore" + i);

                ps.setString(2, "autore" + i + "@example.com");

                ps.executeUpdate();
            }

            System.out.println("5 autori inseriti!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

import java.sql.*;

public class Esercizio22 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        String sql = "SELECT * FROM autori WHERE email = ?";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "ada@email.com");

            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    System.out.println("ID: " +
                            rs.getInt("autore_id"));

                    System.out.println("Nome: " +
                            rs.getString("nome"));

                    System.out.println("Email: " +
                            rs.getString("email"));
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

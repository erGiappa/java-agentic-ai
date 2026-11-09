import java.sql.*;

public class Esercizio12 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             Statement stmt = conn.createStatement()) {

            String sql = "INSERT INTO autori(nome, email) " +
                    "VALUES ('Ada', 'ada@x.com')";

            int righe = stmt.executeUpdate(sql);

            System.out.println("Record inseriti: " + righe);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

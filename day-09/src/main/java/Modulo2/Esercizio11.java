package Modulo2;

import java.sql.*;

public class Esercizio11 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";
        String user = "root";
        String password = "JDBC1234!";

        try (Connection conn =
                     DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS autori (" +
                    "autore_id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nome VARCHAR(100), " +
                    "email VARCHAR(100))";

            stmt.executeUpdate(sql);

            System.out.println("Tabella creata!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

package Modulo3;

import java.sql.*;

public class Esercizio28 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        String sql = "SELECT * FROM autori";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                int id = rs.getInt("autore_id");

                String nome = rs.getString("nome");

                String email = rs.getString("email");

                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Email: " + email);
                System.out.println("----------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

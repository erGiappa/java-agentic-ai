package Modulo2;

import java.sql.*;

public class Esercizio14 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM autori")) {

            while (rs.next()) {

                System.out.println("ID: " +
                        rs.getInt("autore_id"));

                System.out.println("Nome: " +
                        rs.getString("nome"));

                System.out.println("Email: " +
                        rs.getString("email"));

                System.out.println("----------------");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

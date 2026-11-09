package Modulo3;

import java.sql.*;

public class Esercizio21 {
   public static void main(String[] args) {

       String url = "jdbc:mysql://localhost:3308/blogdb";

       String sql = "INSERT INTO autori(nome, email) VALUES (?, ?)";

       try (Connection conn =
                    DriverManager.getConnection(url, "root", "JDBC1234!");
            PreparedStatement ps = conn.prepareStatement(sql)){

           ps.setString(1, "Michael");
           ps.setString(2, "michael@example.com");

           int righe = ps.executeUpdate();

           System.out.println("Autori inseriti: " + righe);
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }
   }
}
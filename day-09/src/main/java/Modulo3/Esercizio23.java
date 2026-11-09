package Modulo3;

import java.sql.*;

public class Esercizio23 {

    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3308/blogdb";

        String sql = "UPDATE autori SET nome=? WHERE email=?";

        try (Connection conn =
                DriverManager.getConnection(url, "root", "JDBC1234!");
                PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, "John");
            ps.setString(2, "ada@email.com");

            int rowUpdated = ps.executeUpdate();

            if (rowUpdated > 0) {
                System.out.println("Autore aggiornato!");
            } else {
                System.out.println("Nessun autore trovato");
            }
        } catch (SQLException  e){
            System.out.println(e.getMessage());
        }
}
}

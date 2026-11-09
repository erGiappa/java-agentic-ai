package Modulo2;

import java.sql.*;

public class Esercizio19 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3308/blogdb";

        try (Connection conn =
                     DriverManager.getConnection(url, "root", "JDBC1234!");
             Statement stmt = conn.createStatement()) {

            boolean risultato = stmt.execute("SELECT * FROM autori");

            if (risultato) {

                ResultSet rs = stmt.getResultSet();

                while (rs.next()) {
                    System.out.println(
                            rs.getString("nome"));
                }

                rs.close();

            } else {
                System.out.println("Nessun ResultSet restituito.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

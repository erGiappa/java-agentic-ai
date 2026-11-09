package Esercizio20;

import java.sql.*;

public class Esercizio20 {

    static String url = "jdbc:mysql://localhost:3308/blogdb";
    static String user = "root";
    static String password = "JDBC1234!";

    //Crea la tabella
    public static void createTable() throws SQLException {

        try (Connection conn =
                     DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String sql = "CREATE TABLE IF NOT EXISTS autori (" +
                    "autore_id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nome VARCHAR(100), " +
                    "email VARCHAR(100))";

            stmt.executeUpdate(sql);

            System.out.println("Tabella creata!");
        }
    }

    //Inserisci un autore

    public static void insertAutor(String nome, String email) throws SQLException {

        String sql = "Insert INTO autori (nome, email) VALUES (?, ?)";

        try (Connection conn =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, email);

            stmt.executeUpdate();

            System.out.println("Autore inserito!");
        }
    }

    // Stampa tutti gli autori
    public static void printAutori() throws SQLException {

        try (Connection conn =
                     DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM autori")) {

            while (rs.next()) {

                System.out.println("ID: " +
                        rs.getInt("autore_id"));

                System.out.println("Nome: " +
                        rs.getString("nome"));

                System.out.println("Email: " +
                        rs.getString("email"));
            }
        }
    }

    // Main
    public static void main(String[] args) {

        try {
            createTable();

            insertAutor("Ada", "ada@email.com");

            printAutori();

        } catch (SQLException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}




package Latihan3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Koneksi {
    // Gunakan relative path untuk database
    private static final String URL = "jdbc:sqlite:kontak.db";
    
    // Metode untuk mendapatkan koneksi ke database
    public static Connection connect() {
        Connection conn = null;
        try {
            // Register driver SQLite
            Class.forName("org.sqlite.JDBC");
            // Membuka koneksi
            conn = DriverManager.getConnection(URL);
            System.out.println("Koneksi ke database berhasil.");
        } catch (ClassNotFoundException e) {
            System.err.println("Driver SQLite tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Gagal terhubung ke database: " + e.getMessage());
        }
        return conn;
    }

    // Metode untuk membuat tabel kontak jika belum ada
    public static void createTable() {
        // Gunakan try-with-resources untuk auto-closing
        String createTableQuery = """
                CREATE TABLE IF NOT EXISTS kontak (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nama TEXT NOT NULL,
                    nomor_telepon TEXT NOT NULL UNIQUE,
                    kategori TEXT NOT NULL
                );
                """;
                
        try (Connection conn = connect(); 
             java.sql.Statement stmt = conn.createStatement()) {
            stmt.execute(createTableQuery);
            System.out.println("Tabel kontak berhasil dibuat atau sudah ada.");
        } catch (SQLException e) {
            System.err.println("Gagal membuat tabel: " + e.getMessage());
        }
    }

    public static boolean isTableExists() {
    String query = """
            SELECT name FROM sqlite_master 
            WHERE type='table' AND name='kontak';
            """;
            
    try (Connection conn = connect();
         java.sql.Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
        return rs.next();
    } catch (SQLException e) {
        System.err.println("Error checking table: " + e.getMessage());
        return false;
    }
}
    
    // Method untuk inisialisasi database dan tabel
    public static void initDatabase() {
        Connection conn = connect();
        if (conn != null) {
            createTable();
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Error menutup koneksi: " + e.getMessage());
            }
        }
    }

    // Tes koneksi dan buat tabel
    public static void main(String[] args) {
        initDatabase();
    }
}
package Model;
import java.sql.*;
import java.util.Scanner;

import Config.*;


public class mCampaign {
    public void addCampaign(int id_comp, String name, String deskripsi, String location, String sallary, String hour) {
        try {
            // membuat koneksi ke database
            DBConection.connection();
            Connection conn = DBConection.connect;

            // membuat statement untuk insert data
            String sql = "INSERT INTO campaign (id_campaign, id_comp, Name, Deskripsi, Location, Sallary, Hour) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_comp);
            stmt.setString(2, name);
            stmt.setString(3, deskripsi);
            stmt.setString(4, location);
            stmt.setString(5, sallary);
            stmt.setString(6, hour);

            // mengeksekusi statement
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data berhasil ditambahkan");
            }

            // menutup koneksi
            stmt.close();
            conn.close();

        } catch (Exception e) {
            // menampilkan error jika terjadi kesalahan
            e.printStackTrace();
        }
    }

    public static void displayCampaign(int id_comp) {
        try {
            // membuat koneksi ke database
            DBConection.connection();
            Connection conn = DBConection.connect;
    
            // membuat statement untuk select data
            String sql = "SELECT Name, Deskripsi, Location, Sallary, Hour FROM campaign WHERE id_comp=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_comp);
    
            // mengeksekusi statement
            ResultSet rs = stmt.executeQuery();
    
            // menampilkan data
            while (rs.next()) {
                String name = rs.getString("Name");
                String deskripsi = rs.getString("Deskripsi");
                String location = rs.getString("Location");
                String sallary = rs.getString("Sallary");
                String hour = rs.getString("Hour");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", name, deskripsi, location, sallary, hour);
            }
            System.out.println("--------------------------------------------------");
    
            // menutup koneksi
            rs.close();
            stmt.close();
            conn.close();
    
        } catch (Exception e) {
            // menampilkan error jika terjadi kesalahan
            e.printStackTrace();
        }
    }

    public static void displayCampaign() {
        try {
            // membuat koneksi ke database
            DBConection.connection();
            Connection conn = DBConection.connect;
    
            // membuat statement untuk select data
            String sql = "SELECT Name, Deskripsi, Location, Sallary, Hour FROM campaign";
            PreparedStatement stmt = conn.prepareStatement(sql);
    
            // mengeksekusi statement
            ResultSet rs = stmt.executeQuery();
    
            // menampilkan data
            while (rs.next()) {
                String name = rs.getString("Name");
                String deskripsi = rs.getString("Deskripsi");
                String location = rs.getString("Location");
                String sallary = rs.getString("Sallary");
                String hour = rs.getString("Hour");
                System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", name, deskripsi, location, sallary, hour);
            }
            System.out.println("--------------------------------------------------");
    
            // menutup koneksi
            rs.close();
            stmt.close();
            conn.close();
    
        } catch (Exception e) {
            // menampilkan error jika terjadi kesalahan
            e.printStackTrace();
        }
    }

    public static void updateCampaignById(int id_campaign, int id_comp, String name, String deskripsi, String location, String sallary, String hour) {
        try {
            // membuat koneksi ke database
            DBConection.connection();
            Connection conn = DBConection.connect;
    
            // membuat statement untuk update data
            String sql = "UPDATE campaign SET Name=?, Deskripsi=?, Location=?, Sallary=?, Hour=? WHERE id_campaign=? AND id_comp=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, deskripsi);
            stmt.setString(3, location);
            stmt.setString(4, sallary);
            stmt.setString(5, hour);
            stmt.setInt(6, id_campaign);
            stmt.setInt(7, id_comp);
    
            // mengeksekusi statement
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data berhasil diupdate");
            } else {
                System.out.println("Data tidak ditemukan");
            }
    
            // menutup koneksi
            stmt.close();
            conn.close();
    
        } catch (Exception e) {
            // menampilkan error jika terjadi kesalahan
            e.printStackTrace();
        }
    }

    public static void deleteCampaignById(int id_campaign, int id_comp) {
        try {
            // membuat koneksi ke database
            DBConection.connection();
            Connection conn = DBConection.connect;
    
            // membuat statement untuk delete data
            String sql = "DELETE FROM campaign WHERE id_campaign=? AND id_comp=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id_campaign);
            stmt.setInt(2, id_comp);
    
            // mengeksekusi statement
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data berhasil dihapus");
            } else {
                System.out.println("Data tidak ditemukan");
            }
    
            // menutup koneksi
            stmt.close();
            conn.close();
    
        } catch (Exception e) {
            // menampilkan error jika terjadi kesalahan
            e.printStackTrace();
        }
    }

}
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Config.DBConection;

public class mJobSeeker {


        public static void addJobSeeker(String username, String password, String name, String email, String address, String phoneNumber) {
                try {
                // membuat koneksi ke database
                DBConection.connection();
                Connection conn = DBConection.connect;

                // membuat statement untuk insert data
                String sql = "INSERT INTO jobseeker (username_seeker, password_seeker, Name, Email, Address, PhoneNumber) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setString(1, username);
                stmt.setString(2, password);
                stmt.setString(3, name);
                stmt.setString(4, email);
                stmt.setString(5, address);
                stmt.setString(6, phoneNumber);

                // mengeksekusi statement
                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                System.out.println("Data berhasil ditambahkan");

                // mendapatkan id_jobseeker yang baru saja ditambahkan
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                        int id_jobseeker = rs.getInt(1);
                        System.out.println("ID Job Seeker: " + id_jobseeker);
                }
                }

                // menutup koneksi
                stmt.close();
                conn.close();

                } catch (Exception e) {
                        // menampilkan error jika terjadi kesalahan
                        e.printStackTrace();
                }
        }

        public static void updateJobSeekerById(int id_jobseeker, String username, String password, String name, String email, String address, String phoneNumber) {
                try {
                    // membuat koneksi ke database
                    DBConection.connection();
                    Connection conn = DBConection.connect;
            
                    // membuat statement untuk update data
                    String sql = "UPDATE jobseeker SET username_seeker=?, password_seeker=?, Name=?, Email=?, Address=?, PhoneNumber=? WHERE id_jobseeker=?";
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.setString(1, username);
                    stmt.setString(2, password);
                    stmt.setString(3, name);
                    stmt.setString(4, email);
                    stmt.setString(5, address);
                    stmt.setString(6, phoneNumber);
                    stmt.setInt(7, id_jobseeker);
            
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

        public static void registCampaign(int id_seeker, int id_camp) {
                try {
                    DBConection.connection();
                    Connection conn = DBConection.connect;
            
                    String sql = "INSERT INTO registed_campaign (id_seeker, id_camp) VALUES (?, ?)";
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.setInt(1, id_seeker);
                    stmt.setInt(2, id_camp);
            
                    int rowsInserted = stmt.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("Data berhasil ditambahkan");
                    }
            
                    // menutup koneksi
                    stmt.close();
                    conn.close();
            
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
}

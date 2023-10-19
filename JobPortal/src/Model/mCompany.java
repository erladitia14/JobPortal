package Model;
import Config.DBConection;
import java.sql.*;

public class mCompany {

    public static void displayData() {
        try {
            // membuat koneksi ke database
            DBConection.connection();
            Connection conn = DBConection.connect;

            // membuat statement untuk query data
            Statement stmt = conn.createStatement();
            String sql = "SELECT Name, Email, Deskripsi FROM company";
            ResultSet rs = stmt.executeQuery(sql);

            // menampilkan data
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("Name"));
                System.out.println("Email: " + rs.getString("Email"));
                System.out.println("Deskripsi: " + rs.getString("Deskripsi"));
            }

            // menutup koneksi
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            // menampilkan error jika terjadi kesalahan
            e.printStackTrace();
        }
    }

    public void addData(String username, String password, String name, String email, String deskripsi) {
        try {
            // membuat koneksi ke database
            DBConection.connection();
            Connection conn = DBConection.connect;
    
            // membuat statement untuk insert data
            String sql = "INSERT INTO company (Id_company, Username_company, Password_company, Name, Email, Deskripsi) VALUES (NULL, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, name);
            stmt.setString(4, email);
            stmt.setString(5, deskripsi);
    
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

    public void updateCompanyById(String username, String password, String name, String email, String deskripsi) {
        try {
            // membuat koneksi ke database
            DBConection.connection();
            Connection conn = DBConection.connect;
    
            // membuat statement untuk update data
            String sql = "UPDATE company SET Password_company=?, Name=?, Email=?, Deskripsi=? WHERE Username_company=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, password);
            stmt.setString(2, name);
            stmt.setString(3, email);
            stmt.setString(4, deskripsi);
            stmt.setString(5, username);
    
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

    public void deleteData(String username) {
        try {
            // membuat koneksi ke database
            DBConection.connection();
            Connection conn = DBConection.connect;
    
            // membuat statement untuk delete data
            String sql = "DELETE FROM company WHERE Username_company=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
    
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

    public static void displayEmployer() {
        try {
            DBConection.connection();
            Connection conn = DBConection.connect;
    
            String sql = "SELECT registed_campaign.id, jobseeker.Name, jobseeker.Email " +
                         "FROM registed_campaign " +
                         "INNER JOIN jobseeker " +
                         "ON registed_campaign.id_seeker = jobseeker.id_jobseeker";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
    
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("Name");
                String email = rs.getString("Email");
    
                System.out.println("Name: " + name + ", Email: " + email);
            }
    
            // menutup koneksi
            rs.close();
            stmt.close();
            conn.close();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

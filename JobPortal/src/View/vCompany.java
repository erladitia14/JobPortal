package View;
import java.util.Scanner;
import Model.*;

public class vCompany {
        public static final String id = "1";
        

        public static void addCompany() {
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan username: ");
                String username = input.nextLine();
                System.out.print("Masukkan password: ");
                String password = input.nextLine();
                System.out.print("Masukkan nama perusahaan: ");
                String name = input.nextLine();
                System.out.print("Masukkan email: ");
                String email = input.nextLine();
                System.out.print("Masukkan deskripsi: ");
                String deskripsi = input.nextLine();
        
                // memanggil method addData pada kelas mCompany
                mCompany company = new mCompany();
                company.addData(username, password, name, email, deskripsi);
            }

        public static void updateCompany() {
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan username yang akan diupdate: ");
                String username = input.nextLine();
                System.out.print("Masukkan password baru: ");
                String password = input.nextLine();
                System.out.print("Masukkan nama perusahaan baru: ");
                String name = input.nextLine();
                System.out.print("Masukkan email baru: ");
                String email = input.nextLine();
                System.out.print("Masukkan deskripsi baru: ");
                String deskripsi = input.nextLine();
            
                // memanggil method updateCompany pada kelas mCompany
                mCompany company = new mCompany();
                company.updateCompanyById(username, password, name, email, deskripsi);
        }

        public static void deleteData() {
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan username yang akan dihapus: ");
                String username = input.nextLine();
            
                // memanggil method deleteData pada kelas mCompany
                mCompany company = new mCompany();
                company.deleteData(username);
        }

        public static void addNewCampaign() {
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan id_comp: ");
                int id_comp = input.nextInt();
                input.nextLine(); // membersihkan buffer
            
                System.out.print("Masukkan Name: ");
                String name = input.nextLine();
            
                System.out.print("Masukkan Deskripsi: ");
                String deskripsi = input.nextLine();
            
                System.out.print("Masukkan Location: ");
                String location = input.nextLine();
            
                System.out.print("Masukkan Sallary: ");
                String sallary = input.nextLine();
            
                System.out.print("Masukkan Hour (Full, Half, atau Internship): ");
                String hour = input.nextLine();

                mCampaign campaign = new mCampaign();
                campaign.addCampaign(id_comp, name, deskripsi, location, sallary, hour);
        }

        public static void updateCampaign() {
                Scanner input = new Scanner(System.in);
                System.out.println("Masukan id_comp anda");
                int id_comp = input.nextInt();
                System.out.print("Masukkan id_campaign yang akan diupdate: ");
                int id_campaign = input.nextInt();
                input.nextLine(); // membersihkan buffer
            
                System.out.print("Masukkan Name: ");
                String name = input.nextLine();
            
                System.out.print("Masukkan Deskripsi: ");
                String deskripsi = input.nextLine();
            
                System.out.print("Masukkan Location: ");
                String location = input.nextLine();
            
                System.out.print("Masukkan Sallary: ");
                String sallary = input.nextLine();
            
                System.out.print("Masukkan Hour (Full, Half, atau Internship): ");
                String hour = input.nextLine();

                mCampaign campaign = new mCampaign();
                campaign.updateCampaignById(id_campaign, id_comp ,name, deskripsi, location, sallary, hour);
        }

        public static void deleteCampaign() {
                Scanner input = new Scanner(System.in);
                System.out.println("Masukan id_comp anda");
                int id_comp = input.nextInt();
                System.out.print("Masukkan id_campaign yang akan dihapus: ");
                int id_campaign = input.nextInt();
            
                // memanggil method deleteData pada kelas mCompany
                mCampaign campaign = new mCampaign();
                campaign.deleteCampaignById(id_campaign, id_comp);
        }

        public static void menuCompany() {
                while(true){
                System.out.print("1.Delate Campaign  \n" + "2. Regist Perusahaan \n" + "3. Update Company \n" + "4. Buat Campaign  \n"+ "5. Tampilkan campaign \n"+ "6. Update campaign \n"+ "7. Lihat Pendaftar \n" + "8. Exit\n" + "Pilih : ");
                Scanner input = new Scanner(System.in);
                String pilihan = input.nextLine();
                
                switch (pilihan) {
                        case "1":
                                deleteCampaign();
                                break;
                        case "2":
                                addCompany();
                                break;
                        case "3":
                                updateCompany();
                                break;
                        case "4":
                                addNewCampaign();
                                break;
                        case "5":
                                mCampaign.displayCampaign(1);
                                break;
                        case "6":
                                updateCampaign();
                                break;
                        case "7":
                                mCompany.displayEmployer();
                                break;
                        case "8":
                                System.out.println("Terima kasih telah menggunakan aplikasi kami.");
                                break;
                        default:
                                System.out.println("Pilihan tidak tersedia, inputkan dengan benar!.");
                }}
        }
}
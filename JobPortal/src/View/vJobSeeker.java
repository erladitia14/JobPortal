package View;
import java.util.Scanner;
import Model.*;

public class vJobSeeker {
        
        public static void addJobSeeker() {
                Scanner input = new Scanner(System.in);
                System.out.print("Masukkan username: ");
                String username = input.nextLine();
                System.out.print("Masukkan password: ");
                String password = input.nextLine();
                System.out.print("Masukkan nama: ");
                String name = input.nextLine();
                System.out.print("Masukkan email: ");
                String email = input.nextLine();
                System.out.print("Masukkan alamat: ");
                String address = input.nextLine();
                System.out.print("Masukkan nomor telepon: ");
                String phoneNumber = input.nextLine();
        
                // memanggil method addJobSeeker pada kelas mJobSeeker
                mJobSeeker jobseeker = new mJobSeeker();
                jobseeker.addJobSeeker(username, password, name, email, address, phoneNumber);
        }


        public static void updateJobSeeker(){
                Scanner input = new Scanner(System.in);
                System.out.println("Masukkan id_jobseeker yang akan diupdate:");
                int id_jobseeker = input.nextInt();
                System.out.print("Masukkan username: ");
                String username = input.nextLine();
                System.out.print("Masukkan password: ");
                String password = input.nextLine();
                System.out.print("Masukkan nama: ");
                String name = input.nextLine();
                System.out.print("Masukkan email: ");
                String email = input.nextLine();
                System.out.print("Masukkan alamat: ");
                String address = input.nextLine();
                System.out.print("Masukkan nomor telepon: ");
                String phoneNumber = input.nextLine();
        
                // memanggil method addJobSeeker pada kelas mJobSeeker
                mJobSeeker jobseeker = new mJobSeeker();
                jobseeker.updateJobSeekerById(id_jobseeker, username, password, name, email, address, phoneNumber);
        }

        public static void menuJobSeeker(){
                System.out.println("Menu Job Seeker");
                System.out.println("1. Add Job Seeker");
                System.out.println("2. Update Job Seeker");
                System.out.println("3. Lihat semua Campaign");
                System.out.println("4. Daftar Campaign");
                System.out.println("5. Exit");
                System.out.print("Pilih menu> ");

                Scanner input = new Scanner(System.in);
                String pilihan = input.nextLine();
                switch(pilihan){
                        case "1":
                                addJobSeeker();
                                break;
                        case "2":
                                updateJobSeeker();
                                break;
                        case "3":
                                mCampaign.displayCampaign();
                                break;
                        case "4":
                                mJobSeeker.registCampaign(4, 1);
                                break;
                        case "5":
                                System.out.println("5. Exit");
                                break;
                        default:
                                System.out.println("Pilihan salah!");
                }
        }
}

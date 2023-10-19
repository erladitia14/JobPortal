import java.util.Scanner;
import View.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        while(true){
            System.out.print("1. Company \n" + "2. Job Seeker \n" + "0. Exit\n" + "Pilih : ");
            Scanner input = new Scanner(System.in);
            String pilihan = input.nextLine();


            if(pilihan.equalsIgnoreCase("0")){
                System.out.println("Terima kasih telah menggunakan aplikasi kami.");
                break;
            }

            switch (pilihan) {
                case "1":
                    vCompany.menuCompany();
                    break;
                case "2":
                    vJobSeeker.menuJobSeeker();
                    break;
            
                default:
                System.out.println("Pilihan tidak tersedia, inputkan dengan benar!.");
                    break;
            }

            
        }
        
    }
}

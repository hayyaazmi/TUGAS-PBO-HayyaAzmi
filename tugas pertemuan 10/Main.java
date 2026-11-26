package pertemuan10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pemilik p = new Pemilik("Dean", "Bandung");
        
        int jumlah;
        do{
            System.out.print("Input jumlah mobil yang dibeli (maks 5): ");
            jumlah = Integer.parseInt(s.nextLine());
            
            if(jumlah <= 0){
                System.out.println("Peringatan: jumlah mobil harus lebih dari 0");
            }else if(jumlah > 5){
                System.out.println("Peringatan: jumlah mobil maksimal 5");
            }
        }while(jumlah <= 0 || jumlah > 5);
        
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println();
            System.out.println("Beli Mobil " + (i + 1) + ":");
            System.out.print("Merk           : ");
            String merek = s.nextLine();
            System.out.print("No             : ");
            String noPlat = s.nextLine();
            System.out.print("Tahun Keluaran : ");
            int tahun = Integer.parseInt(s.nextLine());
            
            p.beliMobil(new Mobil(merek, noPlat, tahun));
        }
        System.out.println("\nPemilik Mobil: " + p.getNama() + ", Alamat: " + p.getAlamat());
        System.out.println("Data Mobil:");
        
        Mobil[] daftar = p.getNoPlatMobil();
        for (int i = 0; i < p.getJumlahMobil(); i++) {
            System.out.println("================================");
            System.out.println("Merk           : " + daftar[i].getMerek());
            System.out.println("No             : " + daftar[i].getNoPlat());
            System.out.println("Tahun Keluaran : " + daftar[i].getTahunKeluaran());
        }
    }
}

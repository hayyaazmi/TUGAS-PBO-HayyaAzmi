package pertemuan4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Sepeda sepeda1 = new Sepeda();
        sepeda1.merk = "Polygon";
        sepeda1.jarakmaju = 10;
        sepeda1.jarakmundur = 5;
        int pilih;
        
        do{
            System.out.println("\nMenu : ");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");

            System.out.print("Pilihan : ");
            pilih = input.nextInt();
            
            if(pilih == 1){
                sepeda1.jarak += 10;
                sepeda1.melaju();
            } else if(pilih == 2){
                sepeda1.jarak -= 5;
                sepeda1.mundur();
            } else if(pilih == 3){
                sepeda1.berhenti();
            } else if(pilih == 0){
                sepeda1.keluar();
            } else{
                System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilih != 0);
    }
}


class Sepeda{
    String merk;
    int jarak = 0;
    int jarakmaju;
    int jarakmundur;
    
    void melaju(){
        System.out.println("Bergerak Maju " + jarakmaju + " Km");
        System.out.println("Object Sepeda " + merk + ", Jarak Tempuh " + jarak + " Km");
    }
    void berhenti(){
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + merk + ", Jarak Tempuh Akhir " + jarak + " Km");
    }
    void mundur(){
        System.out.println("Bergerak Mundur " + jarakmundur + " Km");
        System.out.println("Object Sepeda " + merk + ", Jarak Tempuh " + jarak + " Km");
    }
    void keluar(){
        System.out.println("Keluar Program .. ");
        System.out.println("Terima kasih sudah menggunakan program ini.");
    }
}

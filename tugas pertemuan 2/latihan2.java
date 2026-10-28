package pbo;

import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //menghitung luas persegi panjang  dengan nilai yang sudah ditentukan
        System.out.println("1. Luas persegi panjang");
        
        float panjang = 2;
        float lebar = 5;
        float luas = panjang*lebar;
        
        System.out.print("Luas : " + luas);
        
        //menghitung luas dan keliling lingkaran
        System.out.println("");
        System.out.println("");
        System.out.print("2. Keliling lingkaran");
        
        final float pi = 3.14f;
        float jari;
        
        System.out.println("");
        System.out.print("Masukkan jari-jari : ");
        jari = input.nextFloat();
        
        float luasling = pi*jari*jari;
        float keliling = 2*pi*jari;
        
        System.out.println("Luas lingkaran : " + luasling);
        System.out.println("Keliling lingkaran : " + keliling);
        
        //menghitung total detik
        System.out.println("");
        System.out.println("3. Total detik");
        int jam, menit, detik;
        
        System.out.print("Masukkan jam : ");
        jam = input.nextInt();
        System.out.print("Masukkan menit : ");
        menit = input.nextInt();
        System.out.print("Masukkan detik : ");
        detik = input.nextInt();
        
        int totdet = (jam*3600)+(menit*60)+detik;
        
        System.out.println("Total detik : " + totdet);
    }
}

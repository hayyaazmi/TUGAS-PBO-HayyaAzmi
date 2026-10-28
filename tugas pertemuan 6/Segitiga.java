package pertemuan6;

public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;
    
    public Segitiga(float alas, float tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public void luas(){
        System.out.println("Luas Segitiga : " + (0.5 * alas * tinggi));
    }
    
    public void keliling(){
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        System.out.println("Keliling Segitiga : " + (alas + tinggi + sisiMiring));
    }
}

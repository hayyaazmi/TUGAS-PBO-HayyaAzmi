package pertemuan6;

public class Persegi extends BangunDatar{
    float sisi;
    
    public Persegi(float sisi){
        this.sisi = sisi;
    }
    
    public void luas(){
        System.out.println("Luas Persegi : " + (sisi * sisi));
    }
    
    public void keliling(){
        System.out.println("Keliling Persegi : " + (4 * sisi));
    }
}

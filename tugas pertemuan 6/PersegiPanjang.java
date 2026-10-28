package pertemuan6;

public class PersegiPanjang extends BangunDatar{
    float panjang;
    float lebar;
    
    public PersegiPanjang(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void luas(){
        System.out.println("Luas Persegi Panjang : " + (panjang * lebar));
    }
    
    public void keliling(){
        System.out.println("Keliling Persegi Panjang : " + (2 * (panjang + lebar)));
    }
}

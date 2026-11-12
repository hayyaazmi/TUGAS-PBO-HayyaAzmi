package pertemuan8;

public class Persegi extends BangunDatar{
    private float sisi;
    
    //setter
    public void setSisi(float sisi){
        this.sisi = sisi;
    }
    
    //getter
    public float getSisi(){
        return sisi;
    }
    
    @Override
    public float luas(){
        return sisi * sisi;
    }
    @Override
    public float keliling(){
        return 4 * sisi;
    }
    public float getLuas(){
        return luas();
    }
    public float getKeliling(){
        return keliling();
    }
}

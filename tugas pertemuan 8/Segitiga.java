package pertemuan8;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisimiring;
    
    //setter
    public void setAlas(float alas){
        this.alas = alas;
    }
    public void setTinggi(float tinggi){
        this.tinggi = tinggi;
    }
    public void setSisimiring(float sisimiring){
        this.sisimiring = sisimiring;
    }
    
    //getter
    public float getAlas(){
        return alas;
    }
    public float getTinggi(){
        return tinggi;
    }
    public float getSisimiring(){
        return sisimiring;
    }
    
    @Override
    public float luas(){
        return (float) (0.5 * alas * tinggi);
    }
    @Override
    public float keliling(){
        return alas + tinggi + sisimiring;
    }
    
    public float getLuas(){
        return luas();
    }
    public float getKeliling(){
        return keliling();
    }
}

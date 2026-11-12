package pertemuan8;

public class Lingkaran extends BangunDatar{
    private float jari;
    
    //setter
    public void setJari(float jari){
        this.jari = jari;
    }
    
    //getter
    public float getJari(){
        return jari;
    }
    
    @Override
    public float luas(){
        return (float) (3.14 * jari * jari);
    }
    @Override
    public float keliling(){
        return (float) (2 * 3.14 * jari);
    }
    
    public float getLuas(){
        return luas();
    }
    public float getKeliling(){
        return keliling();
    }
}

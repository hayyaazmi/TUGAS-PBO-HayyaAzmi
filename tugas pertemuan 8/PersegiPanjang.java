package pertemuan8;

public class PersegiPanjang extends BangunDatar{
    private float panjang;
    private float lebar;
    
    //setter
    public void setPanjang(float panjang){
        this.panjang = panjang;
    }
    public void setLebar(float lebar){
        this.lebar = lebar;
    }
    
    //getter
    public float getPanjang(){
        return panjang;
    }
    public float getLebar(){
        return lebar;
    }
    
    @Override
    public float luas(){
        return panjang * lebar;
    }
    @Override
    public float keliling(){
        return 2 * (panjang + lebar);
    }
    
    public float getLuas(){
        return luas();
    }
    public float getKeliling(){
        return keliling();
    }
}

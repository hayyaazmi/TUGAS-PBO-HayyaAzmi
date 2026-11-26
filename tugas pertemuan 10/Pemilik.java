package pertemuan10;

public class Pemilik {
    private String nama, alamat;
    private int jumlahMobil;
    private Mobil[] noPlatMobil = new Mobil[5];
    
    public Pemilik(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahMobil = 0;
    }
    
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public int getJumlahMobil(){
        return jumlahMobil;
    }
    
    public Mobil[] getNoPlatMobil(){
        return noPlatMobil;
    }
    
    public void beliMobil(Mobil mobil){
        if(jumlahMobil >= 5){
            System.out.println(nama + " sudah memiliki 5 mobil.");
            return;
        }
        noPlatMobil[jumlahMobil] = mobil;
        jumlahMobil++;
    }
    
    public void jualMobil(String noPlat){
        int index = -1;
        for (int i = 0; i < jumlahMobil; i++) {
            if(noPlatMobil[i].getNoPlat().equals(noPlat)){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("Mobil " + noPlat + " tidak ditemukan");
            return;
        }
        for (int i = 0; i < jumlahMobil; i++) {
            noPlatMobil[i] = noPlatMobil[i + 1];
        }
        noPlatMobil[jumlahMobil - 1] = null;
        jumlahMobil--;
    }
}

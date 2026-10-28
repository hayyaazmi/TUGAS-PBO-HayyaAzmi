package pertemuan6;

public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi(4);
        Lingkaran l = new Lingkaran(7);
        PersegiPanjang pp = new PersegiPanjang(6, 10);
        Segitiga s = new Segitiga(5, 7);
        BangunDatar bd = new BangunDatar();
        
        p.luas();
        p.keliling();
        
        System.out.println("");
        l.luas();
        l.keliling();
        
        System.out.println("");
        pp.luas();
        pp.keliling();
        
        System.out.println("");
        s.luas();
        s.keliling();
    }
}

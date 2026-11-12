package pertemuan8;

public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.setSisi(8);
        System.out.println("1. Persegi");
        System.out.println("Sisi     : " + p.getSisi());
        System.out.println("------------------------------");
        System.out.println("Luas     : " + p.getLuas());
        System.out.println("Keliling : " + p.getKeliling());
        
        Lingkaran l = new Lingkaran();
        l.setJari(9);
        System.out.println("\n2. Lingkaran");
        System.out.println("Jari-jari : " + l.getJari());
        System.out.println("------------------------------");
        System.out.println("Luas      : " + l.getLuas());
        System.out.println("Keliling  : " + l.getKeliling());
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(12);
        pp.setLebar(5);
        System.out.println("\n3. Persegi Panjang");
        System.out.println("Panjang  : " + pp.getPanjang());
        System.out.println("Lebar    : " + pp.getLebar());
        System.out.println("------------------------------");
        System.out.println("Luas     : " + pp.getLuas());
        System.out.println("Keliling : " + pp.getKeliling());
        
        Segitiga s = new Segitiga();
        s.setAlas(5);
        s.setTinggi(11);
        s.setSisimiring(7);
        System.out.println("\n4. Segitiga");
        System.out.println("Alas        : " + s.getAlas());
        System.out.println("Tinggi      : " + s.getTinggi());
        System.out.println("Sisi Miring : " + s.getSisimiring());
        System.out.println("------------------------------");
        System.out.println("Luas        : " + s.getLuas());
        System.out.println("Keliling    : " + s.getKeliling());
    }
}

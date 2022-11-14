package Pbo_Rental;

public class Main {
    public static void main(String[] args) {
        RegulerBed reguler = new RegulerBed();
        DeluxeBed deluxe = new DeluxeBed();
        PremiumBed premium = new PremiumBed();
        Kamar kmr = deluxe;
        Transaksi tr = new Transaksi();
        tr.setHarga(kmr.getHarga());
        System.out.println(tr.getHarga());
    }
}

package kuis2;

public class Main1831710093 {
    public static void main(String[] args) {
        Pembayaran1831710093 p = new Pembayaran1831710093();
        KeretaApiEksekutif1831710093 kae = new KeretaApiEksekutif1831710093();
        kae.setHargaTiket(2000);
        System.out.println("Harga Total Kereta Aktif Eksekutif = "+p.bayar(kae));
        Pesawat1831710093 pes = new Pesawat1831710093();
        pes.setHargaTiket(5000);
        pes.setBiayaCheckIn(1000);
        System.out.println("Harga Total Pesawat = "+p.bayar(pes));
    }
}

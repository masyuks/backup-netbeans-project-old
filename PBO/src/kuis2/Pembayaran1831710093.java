package kuis2;

public class Pembayaran1831710093 { 
    public int bayar(LayananExtra1831710093 le){
        int h=0;
        if (le instanceof KeretaApiEksekutif1831710093){
            h = ((KeretaApiEksekutif1831710093) le).getHargaTiket()+le.karaoke()+le.restorasi();
        }
        else if (le instanceof KapalPesiar1831710093){
            h = ((KapalPesiar1831710093) le).getBiayaReservasi()+((KapalPesiar1831710093) le).getBiayaVisa()+((KapalPesiar1831710093) le).getHargaTiket()+le.karaoke()+le.restorasi();
        }
        else if (le instanceof Pesawat1831710093){
            h = ((Pesawat1831710093) le).getBiayaCheckIn()+((Pesawat1831710093) le).getHargaTiket()+le.karaoke()+le.restorasi();
        }
        return h;
    }
}

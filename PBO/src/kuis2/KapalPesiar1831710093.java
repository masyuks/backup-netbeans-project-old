package kuis2;

public class KapalPesiar1831710093 implements LayananExtra1831710093 {
    private int biayaReservasi;
    private int biayaVisa;
    private int hargaTiket;

    public int getBiayaReservasi() {
        return biayaReservasi;
    }

    public void setBiayaReservasi(int biayaReservasi) {
        this.biayaReservasi = biayaReservasi;
    }

    public int getBiayaVisa() {
        return biayaVisa;
    }

    public void setBiayaVisa(int biayaVisa) {
        this.biayaVisa = biayaVisa;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
    
    @Override
    public int karaoke() {
        return 3000;
    }

    @Override
    public int restorasi() {
        return 4000;
    }
    
}

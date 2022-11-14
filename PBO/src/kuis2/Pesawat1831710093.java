package kuis2;

public class Pesawat1831710093 implements LayananExtra1831710093 {
    private int biayaCheckIn;
    private int hargaTiket;

    public int getBiayaCheckIn() {
        return biayaCheckIn;
    }

    public void setBiayaCheckIn(int biayaCheckIn) {
        this.biayaCheckIn = biayaCheckIn;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
    
    @Override
    public int karaoke() {
        return 5000; 
    }

    @Override
    public int restorasi() {
        return 6000;
    }
    
}

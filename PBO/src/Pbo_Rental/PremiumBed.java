package Pbo_Rental;

public class PremiumBed extends Kamar {
    private int restorasi, karaoke;
    
    public PremiumBed() {
        super.harga = 300000;
        super.kapasitas = 5;
        restorasi = 50000;
        karaoke = 100000;
    }

    public int getRestorasi() {
        return restorasi;
    }

    public void setRestorasi(int restorasi) {
        this.restorasi = restorasi;
    }

    public int getKaraoke() {
        return karaoke;
    }

    public void setKaraoke(int karaoke) {
        this.karaoke = karaoke;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getHarga() {
        return harga+restorasi+karaoke;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    } 
}

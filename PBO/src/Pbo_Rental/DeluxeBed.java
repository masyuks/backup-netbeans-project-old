package Pbo_Rental;

public class DeluxeBed extends Kamar{
    private int restorasi;
    
    public DeluxeBed() {
        super.harga = 200000;
        super.kapasitas = 4;
        restorasi = 50000;
    }

    public int getRestorasi() {
        return restorasi;
    }

    public void setRestorasi(int restorasi) {
        this.restorasi = restorasi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getHarga() {
        return harga+restorasi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
}

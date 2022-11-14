package Pbo_Rental;

public class RegulerBed extends Kamar {
    public RegulerBed() {
        super.harga = 100000;
        super.kapasitas = 2;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}

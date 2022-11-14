package Pbo_Rental;

public abstract class Kamar {
    protected int kapasitas;
    protected int harga; 
    
    abstract public void setKapasitas(int kapasitas);
    abstract public int getKapasitas();
    abstract public void setHarga(int harga);
    abstract public int getHarga();
    
    
}

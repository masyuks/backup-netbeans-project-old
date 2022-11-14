/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuki.relasiclass.percobaan2;

/**
 *
 * @author ACER
 */
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setMobil(Mobil mobil){
        this.mobil = mobil;
    }
    
    public void setSopir(Sopir sopir){
        this.sopir = sopir;
    }
    
    public void setHari(int hari){
        this.hari = hari;
    }
    
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}

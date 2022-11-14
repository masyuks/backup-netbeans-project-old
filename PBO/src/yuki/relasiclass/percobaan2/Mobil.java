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
public class Mobil {
    private String merk;
    private int biaya;
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public int getBiaya(){
        return biaya;
    }
    
    public int hitungBiayaMobil(int hari){
        return biaya*hari;
    }
}

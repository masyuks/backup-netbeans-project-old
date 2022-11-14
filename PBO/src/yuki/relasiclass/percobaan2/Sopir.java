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
public class Sopir {
    private String nama;
    private int biaya;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getBiaya(){
        return biaya;
    }
    
    public int hitungBiayaSopir(int hari){
        return biaya*hari;
    }
}

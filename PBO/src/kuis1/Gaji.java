/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author ACER
 */
public class Gaji {
    public int gajiPokok;
    private int tunjangan;
    private int potongan;
    
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public int getGajiPokok(){
        return gajiPokok;
    }
    
    public void setTunjangan(int masaKerja){
        if(masaKerja>5){
            tunjangan = gajiPokok*20/100;
        }
        else if((masaKerja<=5) && (masaKerja>=1)){
            tunjangan = gajiPokok*10/100;
        }
        else if(masaKerja<1){
            tunjangan = 0;
        }
    }
    
    public int getTunjangan(){
        return tunjangan;
    }
    
    public void setPotongan(int masaKerja){
        if(masaKerja>5){
            potongan = gajiPokok*5/100;
        }
        else if((masaKerja<5) && (masaKerja>1)){
            potongan = gajiPokok*3/100;
        }
        else if(masaKerja<1){
            potongan = gajiPokok*1/100;
        }
    }
    
    public int getPotongan(){
        return potongan;
    }
    
    public int hitungGajiBersih(){
        return gajiPokok+tunjangan-potongan;
    }
    
    public String info(){
        String info = "";
        info += "Gaji Pokok : "+gajiPokok+"\n";
        info += "Tunjangan  : "+tunjangan+"\n";
        info += "Potongan   : "+potongan+"\n";
        return info;
    }
}

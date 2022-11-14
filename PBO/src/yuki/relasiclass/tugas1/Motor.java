/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuki.relasiclass.tugas1;

/**
 *
 * @author ACER
 */
public class Motor {
    private String merk;
    private String warna;
    private String tahun;
    private Mesin mesin;
    private Rangka rangka;
    private Pengapian pengapian;
    
    public Motor(String merk, String warna, String tahun, Mesin mesin, Rangka rangka, Pengapian pengapian){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.mesin = mesin;
        this.rangka = rangka;
        this.pengapian = pengapian;
    }
    
    public Motor(){}
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setTahun(String tahun){
        this.tahun = tahun;
    }
    
    public String getTahun(){
        return tahun;
    }
    
    public void setMesin(Mesin mesin){
        this.mesin = mesin;
    }
    
    public Mesin getMesin(){
        return mesin;
    }
    
    public void setRangka(Rangka rangka){
        this.rangka = rangka;
    }
    
    public Rangka getRangka(){
        return rangka;
    }
    
    public void setPengapian(Pengapian pengapian){
        this.pengapian = pengapian;
    }
    
    public Pengapian getPengapian(){
        return pengapian;
    }
    
    public String info(){
        String info = "";
        info += "Merk     : "+merk+"\n";
        info += "Warna    : "+warna+"\n";
        info += "Tahun    : "+tahun+"\n";
        info += "Rangka   : "+rangka.info()+"\n";
        info += "Mesin    : "+mesin.info()+"\n";
        info += "Pengapian: "+pengapian.info()+"\n";
        return info;
    }
}

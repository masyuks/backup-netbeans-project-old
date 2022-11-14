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
public class Pegawai {
    private String nip;
    private String nama;
    private int masaKerja;
    private Gaji gaji;
    
    public Pegawai(String nip, String nama, int masaKerja, Gaji gaji){
        this.nip = nip;
        this.nama = nama;
        this.masaKerja = masaKerja;
        this.gaji = gaji;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getNip(){
        return nip;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setMasaKerja(int masaKerja){
        this.masaKerja = masaKerja;
    }
    
    public int getMasaKerja(){
        return masaKerja;
    }
    
    public void setGaji(Gaji gaji){
        this.gaji = gaji;
    }
    
    public Gaji getGaji(){
        return gaji;
    }
    
    public String info(){
        String info = "";
        info += "Nip        : "+nip+"\n";
        info += "Nama       : "+nama+"\n";
        info += "Masa Kerja : "+masaKerja+"\n";
        info += ""+gaji.info()+"\n";
        info += "Gaji Bersih: "+gaji.hitungGajiBersih()+"\n";
        return info;
    }
}

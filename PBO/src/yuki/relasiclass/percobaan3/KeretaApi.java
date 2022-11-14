/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuki.relasiclass.percobaan3;

/**
 *
 * @author ACER
 */
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asissten;
    
    public KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    
    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asissten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asissten = asissten;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setMasinis(Pegawai masinis){
        this.masinis = masinis;
    }
    
    public Pegawai getMasinis(){
        return masinis;
    }
    
    public void setAsissten(Pegawai asissten){
        this.asissten = asissten;
    }
    
    public Pegawai getAsissten(){
        return asissten;
    }
    
    public String info(){
        String info = "";
        info += "Nama    : "+this.nama+"\n";
        info += "Kelas   : "+this.kelas+"\n";
        info += "Masinis : "+this.masinis.info()+"\n";
        info += "Asissten: "+this.asissten.info()+"\n";
        return info;
    }
}

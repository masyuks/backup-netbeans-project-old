/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuki.relasiclass.percobaan4;

/**
 *
 * @author ACER
 */
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;
    
    public Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.initKursi(jumlah);
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    
    public String getKode(){
        return kode;
    }
    
    public void setPenumpang(Penumpang penumpang, int nomer){
        this.arrayKursi[nomer - 1].setPenumpang(penumpang);
    }
    
    private void initKursi(int jml){
        arrayKursi = new Kursi[jml];
        for(int i=0; i<arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi((i+1)+"");
        }
    }
    
    public String info(){
        String info = "";
        info += "Kode      : "+kode+"\n";
        for (Kursi kursi : arrayKursi){
            info += kursi.info();
        }
        
        return info;
    }
}

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
public class Rangka {
    private String jenis;
    private String bahan;
    
    public Rangka(String jenis, String bahan){
        this.jenis = jenis;
        this.bahan = bahan;
    }
    
    public void setBahan(String bahan){
        this.bahan = bahan;
    }
    
    public String getBahan(){
        return bahan;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public String info(){
        String info = "";
        info += "Jenis Rangka: "+jenis+"\n";
        info += "Bahan  : "+bahan+"\n";
        return info;
    }
}

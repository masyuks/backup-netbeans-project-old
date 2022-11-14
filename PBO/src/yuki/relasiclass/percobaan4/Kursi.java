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
public class Kursi {
    private String nomer;
    private Penumpang penumpang;
    
    public Kursi(String nomer){
        this.nomer = nomer;
    }
    
    public void setNomer(String nomer){
        this.nomer = nomer;
    }
    
    public String getNomer(){
        return nomer;
    }
    
    public void setPenumpang(Penumpang penumpang){
        this.penumpang = penumpang;
    }
    
    public Penumpang getPenumpang(){
        return penumpang;
    }
    
    public String info(){
        String info = "";
        info += "Nomer     : "+nomer+"\n";
        if (this.penumpang != null){
            info += "Penumpang : "+penumpang.info()+"\n";
        }
        
        return info;
    }
}

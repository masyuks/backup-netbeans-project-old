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
public class Mesin {
    private String volume;
    private double strokeUp;
    private double boreUp;
    private String transmisi;
    
    public Mesin(String volume, double strokeUp, double boreUp, String transmisi){
        this.volume = volume;
        this.strokeUp = strokeUp;
        this.boreUp = boreUp;
        this.transmisi = transmisi;
    }
    
    public void setVolume(String volume){
        this.volume = volume;
    }
    
    public String getVolume(){
        return volume;
    }
    
    public void setStrokeUp(double strokeUp){
        this.strokeUp = strokeUp;
    }
    
    public double getStrokeUp(){
        return strokeUp;
    }
    
    public void setBoreUp(double boreUp){
        this.boreUp = boreUp;
    }
    
    public double getBoreUp(){
        return boreUp;
    }
    
    public void setTransmisi(String transmisi){
        this.transmisi = transmisi;
    }
    
    public String getTransmisi(){
        return transmisi;
    }
    
    public String info(){
        String info = "";
        info += "Volume (CC): "+volume+"\n";
        info += "Stroke Up  : "+strokeUp+"\n";
        info += "Stroke Up  : "+boreUp+"\n";
        info += "Transmisi  : "+transmisi+"\n";
        return info;
    }
}

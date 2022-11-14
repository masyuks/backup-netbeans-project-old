/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;

/**
 *
 * @author ACER
 */
public class T1_Laptop {
    private String merek;
    private int memory;
    private String kondisi;

    public void setMerek(String m){
        merek = m;
    }

    public void setMemory(int memo){
        memory = memo;
    }

    public void setKondisi(String k){
        kondisi = k;
    }

    public void cetakStatus(){
        System.out.println("");
        System.out.println("Merek     : "+merek);
        System.out.println("Memory    : "+memory+" GB");
        System.out.println("Kondisi   : "+kondisi);
    }
}

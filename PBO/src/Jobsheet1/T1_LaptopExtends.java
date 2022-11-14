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
public class T1_LaptopExtends extends T1_Laptop {
    private String vga;
    
    public void setVga(String v){
        vga = v;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Type Vga  : "+vga);
    }
}

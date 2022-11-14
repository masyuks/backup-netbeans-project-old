/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author ACER
 */
public class T1_VideoGame {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga = 5000;
    public int total;
    
    public int hitungHarga(int s){
        total = harga*s; 
        return total;
    }
    
    public void tampilHarga(){
        System.out.println("-------------------------------------");
        System.out.println("-               Output              -");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.println("ID          : "+id);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game   : "+namaGame);
        System.out.println("Total Harga : "+total);
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("-               Selesai             -");
        System.out.println("-------------------------------------");
    }
}

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
public class T3_Barang {
    public String kodeBrg;
    public String namaBrg;
    public int hargaDasar;
    private float diskon;
    
    public void setDiskon(float d){
        diskon = d/100;
    }
    
    public int hitungHargaJual(){
        return (int) (hargaDasar-(diskon*hargaDasar));
    }
    
    public void tampilBarang(){
        System.out.println("-------------------------------------");
        System.out.println("-               Output              -");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.println("Kode Barang  : "+kodeBrg);
        System.out.println("Nama Barang  : "+namaBrg);
        System.out.println("Harga Dasar  : "+hargaDasar);
        System.out.println("Diskon       : "+diskon);
        System.out.println("              -----------------------");
        System.out.println("Harga Jual   : "+hitungHargaJual());
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("-               Selesai             -");
        System.out.println("-------------------------------------");
    }
}

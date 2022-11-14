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
import java.util.Scanner;
public class T3_BarangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T3_Barang brg = new T3_Barang();
        System.out.println("-------------------------------------");
        System.out.println("-         Harga Jual Barang         -");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.print("Masukkan Kode Barang     : "); 
        brg.kodeBrg = sc.next();
        System.out.print("Masukkan Nama Barang     : "); 
        brg.namaBrg = sc.next();
        System.out.print("Masukkan Harga Dasar     : "); 
        brg.hargaDasar = sc.nextInt();
        System.out.print("Masukkan Diskon (Dalam %): "); 
        brg.setDiskon(sc.nextFloat());
        System.out.println("");
        brg.hitungHargaJual();
        brg.tampilBarang();
    }
}

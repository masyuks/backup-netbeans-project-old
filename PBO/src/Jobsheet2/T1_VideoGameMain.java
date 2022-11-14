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
public class T1_VideoGameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T1_VideoGame vg = new T1_VideoGame();
        System.out.println("-------------------------------------");
        System.out.println("-          Rental VideoGame         -");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.print("Masukkan ID          : "); 
        vg.id = sc.nextInt();
        System.out.print("Masukkan Nama Member : "); 
        vg.namaMember = sc.next();
        System.out.print("Masukkan Nama Game   : "); 
        vg.namaGame = sc.next();
        System.out.print("Lama Waktu Sewa(Jam) : "); 
        vg.hitungHarga(sc.nextInt());
        System.out.println("");
        vg.tampilHarga();
    }
}

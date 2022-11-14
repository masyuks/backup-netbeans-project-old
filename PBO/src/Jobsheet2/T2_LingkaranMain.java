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
public class T2_LingkaranMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T2_Lingkaran l = new T2_Lingkaran();
        System.out.println("-------------------------------------");
        System.out.println("-              Lingkaran            -");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.print("Masukkan Jari-Jari : "); 
        l.r = sc.nextInt();
        System.out.println("");
        System.out.println("Hasil Perhitungan Luas     : "+l.hitungLuas());
        System.out.println("Hasil Perhitungan Keliling : "+l.hitungKeliling());
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("-              Lingkaran            -");
        System.out.println("-------------------------------------");
    }
}

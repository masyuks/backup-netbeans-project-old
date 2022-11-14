/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class T2_KoperasiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("-       Koperasi Simpan Pinjam      -");
        System.out.println("-------------------------------------");
        System.out.println("");
        System.out.print("Masukkan Nomor KTP       : "); 
        String temp1 = sc.next();
        System.out.print("Masukkan Nama            : "); 
        String temp2 = sc.next();
        System.out.print("Masukkan Limit Peminjaman: "); 
        int temp3 = sc.nextInt();
        
        T2_Koperasi kpr = new T2_Koperasi(temp1, temp2, temp3);
        
        System.out.println("");
        System.out.println("Nama Anggota             : " + kpr.getNama());
        System.out.println("Limit Pinjaman           : " + kpr.getLimitPinjaman());
        System.out.println("");
        
        int menu=0;
        while(menu<=2){
            System.out.println("Pilih Menu :");
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Keluar");
            System.out.print("Pilih :");
            menu = sc.nextInt();
            System.out.println("");
            if (menu==1){
                System.out.print("Masukkan Peminjaman      : "); 
                kpr.pinjam(sc.nextInt());
                System.out.println("");
                System.out.println("Jumlah Pinjaman Akhir  : "+kpr.getJumlahPinjaman());
                System.out.println("");
            }
            else if (menu==2){
                System.out.print("Masukkan Angsuran        : "); 
                kpr.angsur(sc.nextInt());
                System.out.println("");
                System.out.println("Jumlah Pinjaman Akhir  : "+kpr.getJumlahPinjaman()); 
                System.out.println("");
            }
            else if (menu==3){
                System.out.println("Jumlah Pinjaman Akhir  : "+kpr.getJumlahPinjaman()); 
                System.out.println("");
                System.out.println("-------------------------------------");
                System.out.println("-            Terima Kasih           -");
                System.out.println("-------------------------------------");
            }
            else {
                System.out.println("Pilihan Menu Tidak ada !!!"); 
            }
        }
    }
}

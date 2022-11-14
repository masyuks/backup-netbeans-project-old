/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class KonversiInetdanBiner_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp, bit="00000000";
        try {
            System.out.println("+========================================+");
            System.out.println("|   Konversi IP Address Inet Ke Biner    |");
            System.out.println("+========================================+");
            System.out.println("");
            System.out.print("=  Masukkan Alamat Website  : ");
            String input = sc.nextLine(); 
            InetAddress cekIp = InetAddress.getByName(input);
            String ip = cekIp.getHostAddress();
            System.out.println("-> IP dari Website tersebut : "+ip);
            System.out.println("");
            int search1 = ip.indexOf(".");
            int ip1 = Integer.valueOf(ip.substring(0, search1));
            temp = ip.substring(search1+1);
            int search2 = temp.indexOf(".");
            int ip2 = Integer.valueOf(temp.substring(0, search2));
            temp = ip.substring(search1+search2+2);
            int search3 = temp.indexOf(".");
            int ip3 = Integer.valueOf(temp.substring(0, search3));
            temp = ip.substring(search1+search2+search3+3);
            int ip4 = Integer.valueOf(temp);
            String biner1 = Integer.toBinaryString(ip1);
            biner1 = bit.substring(biner1.length())+biner1;
            String biner2 = Integer.toBinaryString(ip2);
            biner2 = bit.substring(biner2.length())+biner2;
            String biner3 = Integer.toBinaryString(ip3);
            biner3 = bit.substring(biner3.length())+biner3;
            String biner4 = Integer.toBinaryString(ip4);
            biner4 = bit.substring(biner4.length())+biner4;
            System.out.println("+========================================+");
            System.out.println("|             Hasil Konversi             |");
            System.out.println("+========================================+");
            System.out.println("");
            System.out.println("Biner : "+biner1+"."+biner2+"."+biner3+"."+biner4);
            System.out.println("");
            System.out.println("+========================================+");
            System.out.println("|                Selesai                 |");
            System.out.println("+========================================+");
        } catch (Exception e) {
            System.out.println("Gagal Mendapatkan Koneksi DNS!");
        }
    }
}

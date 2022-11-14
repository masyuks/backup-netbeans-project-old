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
public class P2_KoperasiMain {
    public static void main(String[] args){
        P2_Koperasi kpr = new P2_Koperasi();
        kpr.setNama("Iwan Setiawan");
        kpr.setAlamat("Jalan Sukarno Hatta no 10");
        kpr.setor(100000);
        System.out.println("Simpanan "+kpr.getNama()+" : Rp. "+kpr.getSimpanan());
        
        kpr.pinjam(5000);
        System.out.println("Simpanan "+kpr.getNama()+" : Rp. "+kpr.getSimpanan());
    }
}

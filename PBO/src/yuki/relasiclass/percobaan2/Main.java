/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuki.relasiclass.percobaan2;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args){
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);
        Sopir s = new Sopir();
        s.setNama("John");
        s.setBiaya(200000);
        Pelanggan p = new Pelanggan();
        p.setNama("Jane");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total = "+p.hitungBiayaTotal());
    }
}

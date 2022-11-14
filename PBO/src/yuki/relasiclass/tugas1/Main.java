/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuki.relasiclass.tugas1;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Mesin m = new Mesin("200cc", 62.2, 63.5,"6 Speed");
        Rangka r = new Rangka("Berlian", "Besi");
        Pengapian p = new Pengapian("Aliran AC", "8500 RPM");
        Motor mtr = new Motor("Honda Tiger", "Putih Albino", "2010", m, r, p);
        
        System.out.println(mtr.info());
    }
}

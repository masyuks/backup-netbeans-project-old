/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Gaji g = new Gaji();
        g.setGajiPokok(100000);
        g.setTunjangan(3);
        g.setPotongan(3);
        Pegawai p = new Pegawai("101", "Yuki", 3, g);

        System.out.println(p.info());
        
    }
}

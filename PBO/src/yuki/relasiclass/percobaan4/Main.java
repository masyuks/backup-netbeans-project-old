/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yuki.relasiclass.percobaan4;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345", "Mas Yuks");
        Gerbong g = new Gerbong("A", 10);
        
        g.setPenumpang(p, 1);
        System.out.println(g.info());
    }
}

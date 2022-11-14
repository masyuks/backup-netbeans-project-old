/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;

/**
 *
 * @author ACER
 */
public class T1_LaptopMain {
    public static void main(String[] args){
        T1_Laptop lp1 = new T1_Laptop();
        T1_Laptop lp2 = new T1_Laptop();
        T1_LaptopExtends lp3 = new T1_LaptopExtends();

        lp1.setMerek("Acer RusaX");
        lp1.setMemory(8);
        lp1.setKondisi("Laptop Sedang Menyala");
        lp1.cetakStatus();

        lp2.setMerek("Asus RWT");
        lp2.setMemory(4);
        lp2.setKondisi("Laptop Sedang Mati");
        lp2.cetakStatus();

        lp3.setMerek("Dell Allienware");
        lp3.setMemory(16);
        lp3.setKondisi("Laptop Sedang Menyala");
        lp3.setVga("Nvidia GeForce GTX 4GB");
        lp3.cetakStatus();
    }
}

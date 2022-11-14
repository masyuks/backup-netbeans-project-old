/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MenggunakanOptionPane {
    public static void main(String[] args) {
        // koding untuk menampilkan input dialog
    String nama = JOptionPane.showInputDialog(null, "Siapa namamu ?");
    
    int pilihan = JOptionPane.showConfirmDialog(null,"Coding itu mudah kan , " +nama+ "?");
    
    // koding untuk menampilkan jawaban dari respon yang berbeda
    if(pilihan == JOptionPane.YES_OPTION){
    JOptionPane.showMessageDialog(null, "Tentu saja! "+ "Bahkan anak umur 4 tahun sudah bisa coding java");
    }else{
    JOptionPane.showMessageDialog(null, "Susah sih ! Soalnya saya Malas");
    }
    }
}

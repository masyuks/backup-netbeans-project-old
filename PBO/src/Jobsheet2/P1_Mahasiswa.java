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
public class P1_Mahasiswa {
    public int nim;
    public String nama;
    public String alamat;
    public String kelas;
    
    public void tampilBiodata(){
        System.out.println("Nim   : "+nim);
        System.out.println("Nama  : "+nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Kelas : "+kelas);
    }
}

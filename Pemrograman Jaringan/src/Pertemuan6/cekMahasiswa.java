/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class cekMahasiswa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Mahasiswa m = null;
        ArrayList <Mahasiswa> mhs = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("D:\\Tugas/cekMahasiswa.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                Object obj = ois.readObject();
                mhs = (ArrayList) obj;
            } catch (IOException io) {
                mhs = new ArrayList();
            }
        } catch (Exception e) {
        }
        int pilih=0;
        while(pilih!=4){
            System.out.println("Menu :");
            System.out.println("1. tambah");
            System.out.println("2. tampil");
            System.out.println("3. save");
            System.out.println("4. keluar");
            System.out.print("pilihan : ");
            pilih = sc.nextInt(); 
            System.out.println("");
            switch(pilih){
                case 1 :
                    System.out.print("Nim    : ");
                    String nim = sc.next();
                    System.out.print("Nama   : ");
                    String nama = sc.next();
                    System.out.print("Alamat : ");
                    String alamat = sc.next();
                    System.out.print("Jurusan: ");
                    String jurusan = sc.next();
                    m = new Mahasiswa(nim, nama, alamat, jurusan);
                    mhs.add(m);
                    break;
                case 2 :
                    for (int i = 0; i < mhs.size(); i++) {
                      System.out.println(mhs.get(i));
                    }
                    break;
                case 3 :
                    try {
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Tugas/cekMahasiswa.obj"));
                        oos.writeObject(mhs);
                        oos.flush();
                        oos.close();
                    } catch (FileNotFoundException ex) {
                        throw ex;
                    } catch (IOException ex) {
                        throw ex;
                    }
                    break;
                case 4 :
                    pilih = 4;
                    break;
                default:
                    System.out.println("pilihan tidak ada!");
                    break;
            }
        }
    }
}

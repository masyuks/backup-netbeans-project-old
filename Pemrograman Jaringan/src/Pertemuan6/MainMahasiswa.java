/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ACER
 */
public class MainMahasiswa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Mahasiswa mahasiswa = null;
        ArrayList <Mahasiswa> ListMahasiswa = new ArrayList<>();
        boolean running = true;
        try {
            FileInputStream fis = new FileInputStream("D:\\Tugas/mahasiswa.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                Object obj = ois.readObject();
                ListMahasiswa = (ArrayList) obj;
            } catch (ClassCastException ece) {
                ListMahasiswa = new ArrayList();
            }
        } catch (Exception e) {
        }
        while(running){
            System.out.println("+--------------------------------------+");
            System.out.println("|             List Data Menu           |");
            System.out.println("+--------------------------------------+");
            System.out.println("Pilih Menu :");
            System.out.println("1. Add Mahasiswa");
            System.out.println("2. Remove Mahasiswa");
            System.out.println("3. Get Mahasiswa");
            System.out.println("4. Save & Write");
            System.out.println("5. Exit");
            System.out.print("Choice : ");
            int choice = sc.nextInt(); 
            System.out.println("");
            switch(choice){
                case 1 :
                    System.out.println("+--------------------------------------+");
                    System.out.println("|              Add Mahasiswa           |");
                    System.out.println("+--------------------------------------+");
                    System.out.print("Input Nim    : ");
                    String nim = sc.next();
                    System.out.print("Input Nama   : ");
                    String nama = sc.next();
                    System.out.print("Input Alamat : ");
                    String alamat = sc.next();
                    System.out.print("Input Jurusan: ");
                    String jurusan = sc.next();
                    boolean cekNim = true;
                    for (int i = 0; i < ListMahasiswa.size(); i++) {
                        if (ListMahasiswa.get(i).getNim().equalsIgnoreCase(nim)) {
                            cekNim = false;
                        }
                    }
                    if (cekNim) {
                        Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, jurusan);
                        ListMahasiswa.add(mhs);
                        System.out.println("+--------------------------------------+");
                        System.out.println("|       Data Berhasil Ditambahkan.     |");
                        System.out.println("+--------------------------------------+");
                        System.out.println("");
                    }
                    else {
                        System.out.println("+--------------------------------------+");
                        System.out.println("|          NIM Sudah Terdaftar!        |");
                        System.out.println("+--------------------------------------+");
                        System.out.println("");
                    }
                    break;
                case 2 :
                    System.out.println("+--------------------------------------+");
                    System.out.println("|            Remove Mahasiswa          |");
                    System.out.println("+--------------------------------------+");
                    System.out.print("Input NIM Value   : ");
                    String value = sc.next();
                    for (int i = 0; i < ListMahasiswa.size(); i++) {
                        if (ListMahasiswa.get(i).getNim().equalsIgnoreCase(value)) {
                            ListMahasiswa.remove(i);
                        }
                    }
                    System.out.println("+--------------------------------------+");
                    System.out.println("|          Data Berhasil Dihapus.      |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("");
                    break;
                case 3 :
                    System.out.println("+--------------------------------------+");
                    System.out.println("|             Data Mahasiswa           |");
                    System.out.println("+--------------------------------------+");
                    for (int i = 0; i < ListMahasiswa.size(); i++) {
//                      System.out.println(ListMahasiswa.get(i));
                        System.out.println("-> Mahasiswa "+(i+1));
                        System.out.println("   Nim    : "+ListMahasiswa.get(i).getNim());
                        System.out.println("   Nama   : "+ListMahasiswa.get(i).getNama());
                        System.out.println("   Alamat : "+ListMahasiswa.get(i).getAlamat());
                        System.out.println("   Jurusan: "+ListMahasiswa.get(i).getJurusan());
                        System.out.println("");
                    }
                    break;
                case 4 :
                    try {
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Tugas/mahasiswa.obj"));
                        oos.writeObject(ListMahasiswa);
                        oos.flush();
                        oos.close();
                    } catch (FileNotFoundException ex) {
                        throw ex;
                    } catch (IOException ex) {
                        throw ex;
                    }
                    System.out.println("+--------------------------------------+");
                    System.out.println("|          Data Berhasil Disave.       |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("");
                    break;
                case 5 :
                    System.out.println("+--------------------------------------+");
                    System.out.println("|             See You Again!           |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("");
                    running = false;
                    break;
                default:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|              Notification            |");
                    System.out.println("+--------------------------------------+");
                    System.out.println(" -> Menu Pilihan Tidak Ada!");
                    System.out.println("");
                    break;
            }
        }
    }
}

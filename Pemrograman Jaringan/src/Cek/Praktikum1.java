/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Praktikum1 {

     private static void writeObject(Object o) throws Exception {
         try {
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Tugas/mahasiswa.obj"));
             oos.writeObject(o);
             oos.flush();
             oos.close();
         } catch (FileNotFoundException ex) {
             throw ex;
         } catch (IOException ex) {
             throw ex;
         }
     }

     private static Object readObject() throws Exception {
         ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Tugas/mahasiswa.obj"));
         try {
             Object readObject = ois.readObject();
             ois.close();
             return readObject;
         } catch (ClassNotFoundException ex) {
             throw ex;
         }
     }

     public static void main(String[] args) {
         Mahasiswa m = new Mahasiswa("075410099", "AL Ayubbi");
         try {
             writeObject(m);
             Mahasiswa readObject = (Mahasiswa) readObject();
             System.out.println("" + readObject);
         } catch (Exception ex) {
             Logger.getLogger(Praktikum1.class.getName()).log(Level.SEVERE, null, ex);
         }
     }

 }

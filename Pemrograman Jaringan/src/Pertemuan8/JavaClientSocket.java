/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author ACER
 */
public class JavaClientSocket {
    public static void main(String[] args) {
        try {
            Socket sk = new Socket("10.10.10.200", 1111);
            DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
            dos.writeBytes("Ini Pesan dari Client");
//            bw.write("Ini Pesan dari Client");
            sk.close();
        } catch (Exception e) {
            System.out.println("Client Gagal");
            System.out.println(e);
        }
    }
}

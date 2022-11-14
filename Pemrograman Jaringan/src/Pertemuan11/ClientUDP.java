/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author ACER
 */
public class ClientUDP {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            InetAddress alamat = InetAddress.getByName("localhost");
            int port=1111;  
            String pesan="Hai Rek...kamu dimana?";
            byte[] b=pesan.getBytes();
            DatagramPacket dp = new DatagramPacket(b,b.length,alamat,port);
            DatagramSocket ds = new DatagramSocket();
            ds.send(dp);
        } catch (Exception e) {
        }
    }
}

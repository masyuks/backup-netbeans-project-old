/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author ACER
 */
public class ServerUDP {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            byte [] buffer = new byte[655];
            DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
            DatagramSocket ds = new DatagramSocket(1111);
            ds.receive(dp);
            byte[] data=dp.getData();
            String pesan = new String(data,0,data.length);
            System.out.println("Pesannya adalah "+pesan);
            ds.close();
        } catch (Exception e) {
        }
    }
}

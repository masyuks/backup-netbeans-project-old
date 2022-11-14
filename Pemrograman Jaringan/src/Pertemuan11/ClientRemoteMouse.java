/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ClientRemoteMouse {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            InetAddress alamat = InetAddress.getByName("localhost");
            int port=1111;  
            PointerInfo pi;
            Point po;
            for(;;){
                pi = MouseInfo.getPointerInfo();
                po = pi.getLocation();
                int x = (int) po.getX();
                int y = (int) po.getY();
                String xx = String.valueOf(x);
                String yy = String.valueOf(y);
                String pesan = xx+" "+yy;
                byte[] b=pesan.getBytes();
                DatagramPacket dp = new DatagramPacket(b,b.length,alamat,port);
                DatagramSocket ds = new DatagramSocket();
                ds.send(dp);
//                System.out.println(pesan);
            }
        } catch (Exception e) {
        }
    }
}

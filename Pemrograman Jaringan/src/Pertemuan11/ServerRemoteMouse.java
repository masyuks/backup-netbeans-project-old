/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author ACER
 */
public class ServerRemoteMouse {
    public static void main(String[] args) throws AWTException {
        // TODO code application logic here
        Robot bot = new Robot();
        try {
            for(;;){
            byte [] buffer = new byte[655];
            DatagramPacket dp = new DatagramPacket(buffer,buffer.length);
            DatagramSocket ds = new DatagramSocket(1111);
            
                ds.receive(dp);
                byte[] data=dp.getData();
                String pesan = new String(data,0,data.length);
                String[] kata = pesan.split(" ");
                bot.mouseMove(Integer.parseInt(kata[0]), Integer.parseInt(kata[1]));
            ds.close();
            }
            
        } catch (Exception e) {
        }
    }
}

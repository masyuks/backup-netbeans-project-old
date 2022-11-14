/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class JavaServerSocket {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1111);
            Socket serverSocket = ss.accept();
            DataInputStream dis = new DataInputStream(serverSocket.getInputStream());
            System.out.println(dis.readLine());
            serverSocket.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

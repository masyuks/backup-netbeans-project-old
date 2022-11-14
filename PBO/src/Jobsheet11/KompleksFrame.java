/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class KompleksFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setVisible(true);
        frame.setForeground(Color.BLUE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(10, 50);
        frame.setSize(300, 100);
        frame.setTitle("Frame Koding itu Mudah");
    }
}

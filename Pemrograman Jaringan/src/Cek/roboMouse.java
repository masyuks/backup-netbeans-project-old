/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cek;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.MouseInfo;
import java.awt.Panel;
import java.awt.Point;
import java.awt.Robot;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ACER
 */
class robomouse extends Frame implements ActionListener
{

    static JFrame f; 
  
    // textField 
    static TextField x, y; 
  
    // default constructor 
    robomouse() 
    { 
    } 
  
    // main function 
    public static void main(String args[]) 
    { 
        // object of class 
        robomouse rm = new robomouse(); 
  
        // create a frame 
        f = new JFrame("robomouse"); 
  
        // set the frame to close on exit 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  
        // create textfield 
        x = new TextField(7); 
        y = new TextField(7); 
  
        // create a button 
        Button b = new Button("OK"); 
  
        // add actionListener 
        b.addActionListener(rm); 
  
        // create a panel 
        Panel p = new Panel(); 
  
        // add items to panel 
        p.add(x); 
        p.add(y); 
        p.add(b); 
  
        f.add(p); 
  
        // setsize of frame 
        f.setSize(300, 300); 
  
        f.show(); 
    } 
  
    // if button is pressed 
    public void actionPerformed(ActionEvent e) 
    { 
        try { 
            Robot r = new Robot(); 
            int xi1, yi1, xi, yi; 
  
            // get initial loction 
            Point p = MouseInfo.getPointerInfo().getLocation(); 
            xi = p.x; 
            yi = p.y; 
  
            // get x and y points 
            xi1 = Integer.parseInt(x.getText()); 
            yi1 = Integer.parseInt(y.getText()); 
            int i = xi, j = yi; 
  
            // slowly move the mouse to detined location 
            while (i != xi1 || j != yi1) { 
                // move the mouse to the other point 
                r.mouseMove(i, j); 
  
                if (i < xi1) 
                    i++; 
                if (j < yi1) 
                    j++; 
  
                if (i > xi1) 
                    i--; 
                if (j > yi1) 
                    j--; 
  
                // wait 
                Thread.sleep(30); 
            } 
        } 
        catch (Exception evt) { 
            System.err.println(evt.getMessage()); 
        } 
    }
}
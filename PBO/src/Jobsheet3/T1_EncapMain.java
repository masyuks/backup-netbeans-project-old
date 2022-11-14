/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author ACER
 */
public class T1_EncapMain {
    public static void main(String args[]){
        T1_Encap enc = new T1_Encap();
        enc.setName("James");
        enc.setAge(35);
        
        System.out.println("Name   : "+enc.getName());
        System.out.println("Age    : "+enc.getAge());
    }
}

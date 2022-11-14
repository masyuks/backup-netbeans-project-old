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
public class T1_Encap {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int a){
        if (a<=30 && a>=18){
            age=30;
        }
        else {
            age=a;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.percobaan2;

import inheritance.percobaan1.ClassC;

public class ClassD extends ClassC {
    private int x;
    
    public static void main(String[] args){
        ClassD d = new ClassD();
        d.t = 10;
        d.u = 7;
        d.v = 5;
        d.w = 10;
    }
}

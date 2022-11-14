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
public class P1_MotorMain {
    public static void main(String[] args){
        P1_MotorEnkapsulasi mtr = new P1_MotorEnkapsulasi();
        mtr.printStatus();
        mtr.tambahKecepatan();
        
        mtr.nyalakanMesin();
        mtr.printStatus();
        
        mtr.tambahKecepatan();
        mtr.printStatus();
        
        mtr.tambahKecepatan();
        mtr.printStatus();
        
        mtr.tambahKecepatan();
        mtr.printStatus();
        
        mtr.matikanMesin();
        mtr.printStatus();
    }
}

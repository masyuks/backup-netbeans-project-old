/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.percobaan5;

public class Manager extends Karyawan{
    public int tunjungan;
    
    public Manager(){
        
    }
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjungan       ="+tunjungan);
        System.out.println("Total Gaji      ="+(super.gaji+tunjungan));
    }
}

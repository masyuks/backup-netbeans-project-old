/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.percobaan6;

public class Main {
    public static void main(String[] args){
        StaffTetap ST = new StaffTetap("Budi", "Malang", "Lakilaki", 20, 2000000, 250000, 2000000, "2A", 100000);
        ST.tampilStaffTetap();
        
        
        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }
}

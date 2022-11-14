package Test;

import java.util.Scanner;

public class ProgramPerhitunganJasaArsitek {
    public static void main(String[] args) {
        int harga, luas;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Luas : "); 
        luas = sc.nextInt();
        if (luas >= 50) {
            int temp = luas - 50;
            harga = (1500000*temp) + 50000000;  
        } else {
            harga = 50000000;
        }
        System.out.println("Harga yang dibayar sebesar : "+harga);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author ACER
 */
public class P1_MahasiswaMain {
    public static void main(String args[]){
        P1_Mahasiswa mhs1 = new P1_Mahasiswa();
        P1_Mahasiswa mhs2 = new P1_Mahasiswa();
        P1_Mahasiswa mhs3 = new P1_Mahasiswa();
        
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        mhs2.nim = 102;
        mhs2.nama = "Mas Yuks";
        mhs2.alamat = "Jl. Pallapa No 1A";
        mhs2.kelas = "2E";
        mhs2.tampilBiodata();
        
        mhs3.nim = 103;
        mhs3.nama = "Iqbal";
        mhs3.alamat = "Jl. Kecoak No 1A";
        mhs3.kelas = "2E";
        mhs3.tampilBiodata();
    }
}

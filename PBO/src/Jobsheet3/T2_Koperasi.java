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
public class T2_Koperasi {
    private String no_ktp;
    private String nama;
    private int limit;
    private int pinjaman;
    
    public T2_Koperasi(String no_ktp, String nama, int limit){
        this.no_ktp = no_ktp;
        this.nama = nama;
        this.limit = limit;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getLimitPinjaman(){
        return limit;
    }
    
    public int getJumlahPinjaman(){
        return pinjaman;
    }
    
    public void angsur(int uang){
        if (uang>(pinjaman*10/100)){
            pinjaman -= uang;
        }
        else {
            System.out.println("Maaf, angsuran harus Lebih dari 10% pinjaman. \n");
        }
    }
    
    public void pinjam(int uang){
        if (uang<=limit){
            pinjaman += uang;
        }
        else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit. \n");
        }
    }
    
}

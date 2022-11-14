/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet11.percobaan3;

/**
 *
 * @author HP
 */
public class Biodata {
    String nim;
    String nama;
    String jurusan;
    String gender;
    boolean baca;
    boolean makan;
    boolean tidur;
    String alamat;

    public Biodata() {
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBaca(boolean baca) {
        this.baca = baca;
    }

    public void setMakan(boolean makan) {
        this.makan = makan;
    }

    public void setTidur(boolean tidur) {
        this.tidur = tidur;
    }
    

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getGender() {
        return gender;
    }

    public boolean isBaca() {
        return baca;
    }

    public boolean isMakan() {
        return makan;
    }

    public boolean isTidur() {
        return tidur;
    }

    public String getAlamat() {
        return alamat;
    }
    
    
}

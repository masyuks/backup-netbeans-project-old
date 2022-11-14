package Pbo_Rental;

import java.sql.ResultSet;
import java.util.ArrayList;

public class User {
    private int nik;
    private String nama;
    private String alamat;
    private String no_telp;

    public User(int nik, String nama, String alamat, String no_telp) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    
    public User(){}

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    
    public User getByNik(int key){
        User user = new User();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user " +
                                            "WHERE nik = '"+ key +"'");
        try {
            while (rs.next()) {
                user = new User();
                user.setNik(rs.getInt("nik"));
                user.setNama(rs.getString("nama"));
                user.setAlamat(rs.getString("alamat"));
                user.setNo_telp(rs.getString("no_telp"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
    public void save(){
        if (getByNik(nik).getNik() == 0) {
            String SQL = "INSERT INTO user(nik, nama, alamat, " +
                         " no_telp) VALUES ('"+ nik +"', '"+ nama +"', " +
                         "'"+ alamat +"', '"+no_telp+"')";
            this.nik = DBHelper.insertQueryGetId(SQL);
        }
    }
    
    public void update(){
        String SQL = "UPDATE user SET " +
                     "nama = '"+ nama +"', " +
                     "alamat = '"+ alamat +"', " +
                     "no_telp = '"+ no_telp +"' " + 
                     "WHERE nik = '"+ getNik() +"'";
        DBHelper.executeQuery(SQL);
    }
}

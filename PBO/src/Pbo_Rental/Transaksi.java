package Pbo_Rental;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Transaksi implements Diskon {
    private String tglCheckin, status;
    private int idKamar, nik, idTransaksi, harga, lamaSewa, totalHarga;
    private String nama, jenis;

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getTglCheckin() {
        return tglCheckin;
    }

    public void setTglCheckin(String tglCheckin) {
        this.tglCheckin = tglCheckin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdKamar() {
        return idKamar;
    }

    public void setIdKamar(int idKamar) {
        this.idKamar = idKamar;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    @Override
    public int hitungDiskon() {
        int disc=0;
        if ((getHarga()*getLamaSewa())>1000000) {
            disc = 10 * (getHarga()*getLamaSewa()) /100;
        }
        else {
            disc = 0;
        }
        return disc;
    }
    
    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga() {
        totalHarga = (getHarga()*getLamaSewa()) - hitungDiskon();
    }
    
    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public Transaksi getByNik(int key){
        Transaksi transaksi = new Transaksi();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM transaksi " +
                                            "WHERE nik = '"+ key +"'");
        try {
            while (rs.next()) {
                transaksi = new Transaksi();
                transaksi.setIdTransaksi(rs.getInt("id_transaksi"));
                transaksi.setNik(rs.getInt("nik"));
                transaksi.setIdKamar(rs.getInt("id_kamar"));
                transaksi.setTglCheckin(rs.getString("tgl_checkin"));
                transaksi.setLamaSewa(rs.getInt("lama_sewa"));
                transaksi.setTotalHarga(rs.getInt("total_harga"));
                transaksi.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return transaksi;
    }
    
    public ArrayList<Transaksi> getAll(){
        ArrayList<Transaksi> listTransaksi = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT user.nama, transaksi.id_transaksi, transaksi.tgl_checkin, transaksi.lama_sewa, transaksi.total_harga, transaksi.status, kamar.jenis "+
                                            "FROM user " +
                                            "INNER JOIN transaksi " +
                                            "INNER JOIN kamar " +
                                            "ON user.nik=transaksi.nik " +
                                            "AND transaksi.id_kamar=kamar.id_kamar");
        try {
            while (rs.next()) {
                Transaksi transaksi = new Transaksi();
                transaksi.setIdTransaksi(rs.getInt("id_transaksi"));
                transaksi.setNama(rs.getString("nama"));
                transaksi.setJenis(rs.getString("jenis"));
                transaksi.setTglCheckin(rs.getString("tgl_checkin"));
                transaksi.setLamaSewa(rs.getInt("lama_sewa"));
                transaksi.setTotalHarga(rs.getInt("total_harga"));
                transaksi.setStatus(rs.getString("status"));
                listTransaksi.add(transaksi);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTransaksi;
    }
    
    public ArrayList<Transaksi> search(int key){
        ArrayList<Transaksi> listTransaksi = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT user.nama, transaksi.id_transaksi, transaksi.tgl_checkin, transaksi.lama_sewa, transaksi.total_harga, transaksi.status, kamar.jenis "+
                                            "FROM user " +
                                            "INNER JOIN transaksi " +
                                            "INNER JOIN kamar " +
                                            "ON user.nik=transaksi.nik " +
                                            "AND transaksi.id_kamar=kamar.id_kamar "+
                                            "WHERE user.nik = '"+ key +"'");
        try {
            while (rs.next()) {
                Transaksi transaksi = new Transaksi();
                transaksi.setIdTransaksi(rs.getInt("id_transaksi"));
                transaksi.setNama(rs.getString("nama"));
                transaksi.setJenis(rs.getString("jenis"));
                transaksi.setTglCheckin(rs.getString("tgl_checkin"));
                transaksi.setLamaSewa(rs.getInt("lama_sewa"));
                transaksi.setTotalHarga(rs.getInt("total_harga"));
                transaksi.setStatus(rs.getString("status"));
                listTransaksi.add(transaksi);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTransaksi;
    }
    
    public void save(){
        if (getByNik(nik).getNik() == 0) {
            String SQL = "INSERT INTO transaksi(nik, id_kamar, lama_sewa, " +
                         " tgl_checkin, total_harga, status) VALUES ('"+ nik +"', '"+ idKamar +"', " +
                         "'"+lamaSewa+"', '"+ tglCheckin +"', "+
                         "'"+totalHarga+"','"+ status +"')";
            this.idTransaksi = DBHelper.insertQueryGetId(SQL);
        }
    }
    
    public void update(){
        String SQL = "UPDATE transaksi SET " +
                     "id_kamar = '"+ idKamar +"', " +
                     "lama_sewa = '"+ lamaSewa +"', " +
                     "tgl_checkin = '"+ tglCheckin +"', " +
                     "total_harga = '"+ totalHarga +"', " +
                     "status = '"+ status +"' " +
                     "WHERE nik = '"+ getNik() +"'";
        DBHelper.executeQuery(SQL);
    }
    
    public void bayar(){
        String SQL = "UPDATE transaksi SET " +
                     "status = 'Lunas' " +
                     "WHERE nik = '"+ getNik() +"'";
        DBHelper.executeQuery(SQL);
    }
}

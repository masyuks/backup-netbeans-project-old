package ProjectUts;

public class Motor extends Kendaraan{
    private String merk;
    private String warna;
    private String tahun;
    private Mesin mesin;
    private Rangka rangka;
    private Pengapian pengapian;
    
    public Motor(String merk, String warna, int kecepatan, String daya, String tahun, Mesin mesin, Rangka rangka, Pengapian pengapian){
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.daya = daya;
        this.tahun = tahun;
        this.mesin = mesin;
        this.rangka = rangka;
        this.pengapian = pengapian;
    }
    
    public Motor(){}
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }
    
    public int getKecepatan(){
        return kecepatan;
    }
    
    public void setDaya(String daya){
        this.daya = daya;
    }
    
    public String getDaya(){
        return daya;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setTahun(String tahun){
        this.tahun = tahun;
    }
    
    public String getTahun(){
        return tahun;
    }
    
    public void setMesin(Mesin mesin){
        this.mesin = mesin;
    }
    
    public Mesin getMesin(){
        return mesin;
    }
    
    public void setRangka(Rangka rangka){
        this.rangka = rangka;
    }
    
    public Rangka getRangka(){
        return rangka;
    }
    
    public void setPengapian(Pengapian pengapian){
        this.pengapian = pengapian;
    }
    
    public Pengapian getPengapian(){
        return pengapian;
    }
    
    public void spesifikasi(){
        System.out.println("================================");
        System.out.println("+> "+merk);
        System.out.println("Warna          : "+warna);
        System.out.println("Kecepatan (RPM): "+kecepatan);
        System.out.println("Daya           : "+daya);
        System.out.println("Tahun Pembuatan: "+tahun);
        System.out.println("--------------------------------");
        System.out.println("-> Rangka");
        rangka.spesifikasi();
        System.out.println("--------------------------------");
        System.out.println("-> Mesin");
        mesin.spesifikasi();
        System.out.println("--------------------------------");
        System.out.println("-> Pengapian");
        pengapian.spesifikasi();
        System.out.println("================================");
        System.out.println("");
    }
}

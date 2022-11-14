package ProjectUts;

public class Main {
    public static void main(String[] args) {
        Mesin m1 = new Mesin("200cc", 62.2, 63.5,"6 Speed");
        Rangka r1 = new Rangka("Berlian", "Besi");
        Pengapian p1 = new Pengapian("Aliran AC", "8500 RPM");
        Motor mtr1 = new Motor("Honda Tiger", "Putih Albino", 6500, "Mesin 200cc","2010", m1, r1, p1);    
        mtr1.spesifikasi();
        
        Mesin m2 = new Mesin();
        Rangka r2 = new Rangka();
        Pengapian p2 = new Pengapian();
        Motor mtr2 = new Motor();
        m2.setVolume("125cc");
        m2.setStrokeUp(49.5);
        m2.setBoreUp(56.5);
        m2.setTransmisi("5 Speed");
        r1.setJenis("Diamond Steel");
        r1.setBahan("Besi");
        p1.setType("Aliran DC");
        p1.setLimit("5500 RPM");
        mtr2.setMerk("Honda GL MAX");
        mtr2.setWarna("Hitam");
        mtr2.setKecepatan(5000);
        mtr2.setDaya("Mesin 125cc");
        mtr2.setTahun("2002");
        mtr2.setMesin(m2);
        mtr2.setRangka(r2);
        mtr2.setPengapian(p2);
        mtr2.spesifikasi();
    }
}

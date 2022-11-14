package interfacelatihan2;

public class Rektor {
public void beriSertifikatCumlaude(ICumlaude mahasiswa, Mahasiswa mhs){
    System.out.println("Saya Rektor, memberikan sertifikat cumlaude");
    System.out.println("Selamat silahkan perkenalkan diri anda");
    mhs.kuliahDiKampus();
    mahasiswa.lulus();
    mahasiswa.meraihIPKTinggi();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
}
public void beriSertifikatMawapres(IBerprestasi mahasiswa){
    System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
    System.out.println("Selamat, bagaimana anda bisa berprestasi ?");
    mahasiswa.menjuaraiKompetisi();
    mahasiswa.membuatPublikasiIlmiah();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++");    
    }    
}

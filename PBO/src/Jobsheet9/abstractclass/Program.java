package Jobsheet9.abstractclass;

public class Program {
    public static void main(String[] args){
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        
        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");
        
        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumbaLumba);
        
        ani.ajakpeliharaanJalanJalan();
        budi.ajakpeliharaanJalanJalan();
    }
}

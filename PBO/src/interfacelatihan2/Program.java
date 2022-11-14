package interfacelatihan2;

public class Program {

    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        Mahasiswa mahasiswaBiasa=new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude=new Sarjana("Dini");
        PascaSarjana masterCumlaude=new PascaSarjana("Elok");
        //pakrektor.beriSertifikatCumlaude(mahasiswaBiasa);
        //pakrektor.beriSertifikatCumlaude(sarjanaCumlaude,sarjanaCumlaude);
        //pakrektor.beriSertifikatCumlaude(masterCumlaude,sarjanaCumlaude);
        pakrektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakrektor.beriSertifikatMawapres(masterCumlaude);
    }
}
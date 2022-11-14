package ProjectUts;

public class Rangka extends Motor{
    private String jenis;
    private String bahan;
    
    public Rangka(String jenis, String bahan){
        this.jenis = jenis;
        this.bahan = bahan;
    }
    
    public Rangka(){}
    
    public void setBahan(String bahan){
        this.bahan = bahan;
    }
    
    public String getBahan(){
        return bahan;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    @Override
    public void spesifikasi(){
        System.out.println("Jenis Rangka   : "+jenis);
        System.out.println("Bahan          : "+bahan);
    }
}
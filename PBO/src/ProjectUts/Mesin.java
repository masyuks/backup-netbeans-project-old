package ProjectUts;

public class Mesin extends Motor{
    private String volume;
    private double strokeUp;
    private double boreUp;
    private String transmisi;
    
    public Mesin(String volume, double strokeUp, double boreUp, String transmisi){
        this.volume = volume;
        this.strokeUp = strokeUp;
        this.boreUp = boreUp;
        this.transmisi = transmisi;
    }
    
    public Mesin(){}
    
    public void setVolume(String volume){
        this.volume = volume;
    }
    
    public String getVolume(){
        return volume;
    }
    
    public void setStrokeUp(double strokeUp){
        this.strokeUp = strokeUp;
    }
    
    public double getStrokeUp(){
        return strokeUp;
    }
    
    public void setBoreUp(double boreUp){
        this.boreUp = boreUp;
    }
    
    public double getBoreUp(){
        return boreUp;
    }
    
    public void setTransmisi(String transmisi){
        this.transmisi = transmisi;
    }
    
    public String getTransmisi(){
        return transmisi;
    }
    
    @Override
    public void spesifikasi(){
        System.out.println("Volume (CC)    : "+volume);
        System.out.println("Stroke Up      : "+strokeUp);
        System.out.println("Bore Up        : "+boreUp);
        System.out.println("Transmisi      : "+transmisi);
    }
}
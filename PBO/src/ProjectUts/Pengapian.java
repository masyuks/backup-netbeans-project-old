package ProjectUts;

public class Pengapian extends Motor{
    private String type;
    private String limit;
    
    public Pengapian(String type, String limit){
        this.type = type;
        this.limit = limit;
    }
    
    public Pengapian(){}
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getType(){
        return type;
    }
    
    public void setLimit(String limit){
        this.limit = limit;
    }
    
    public String getLimit(){
        return limit;
    }
    
    @Override
    public void spesifikasi(){
        System.out.println("Type Pengapian : "+type);
        System.out.println("Limit Pengapian: "+limit);
    }
}

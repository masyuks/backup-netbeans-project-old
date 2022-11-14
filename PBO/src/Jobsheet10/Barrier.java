package Jobsheet10;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength ;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public String getBarrierInfo(){
        String info = "Barrier Strength : "+getStrength();
        return info;
    }
    
    @Override
    public void destroyed(){
     strength = (int) (strength - (strength * 0.1));   
    }
}

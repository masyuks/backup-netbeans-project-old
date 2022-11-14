package Jobsheet10;

public class jumpingZombie extends Zombie {
    
    public jumpingZombie(int health, int level) {
    this.health = health;
    this.level = level;
    }
    
    @Override
    public void heal(){
        int health = 0;
        switch (level){
            case 1:
                health = (int) (health + health * 0.3);
                break;
            case 2:
                health = (int) (health + health * 0.4);
                break;
            case 3:
                health = (int) (health + health * 0.5);
                break;//To change body of generated methods, choose Tools | Templates.
        }
    }
    
    @Override
    public void destroyed(){
        health = (health-(int)(health*0.1));
    }
    
    @Override
    public String getZombieInfo(){
        String info = super.getZombieInfo()+"\n";
        info += "---JumpingZombie Data--- \n" + "Health : "+health +"\n" +"Level : " + level +"\n" ;
        return info;
    }
}
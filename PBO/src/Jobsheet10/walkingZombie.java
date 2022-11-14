package Jobsheet10;

public class walkingZombie extends Zombie {

    public walkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal(){
        switch (level){
            case 1:
                health = (int) (health + health * 0.2);
                break;
            case 2:
                health = (int) (health + health * 0.3);
                break;
            case 3:
                health = (int) (health + health * 0.4);
                break;
        }
    }
    
    @Override
    public void destroyed(){
        health = (health-(int)(health*0.2));
    }
    
    @Override
    public String getZombieInfo(){
        String info = super.getZombieInfo()+"\n";
        info += "---WalkingZombie Data--- \n" + "Health : "+health +"\n" +"Level : " + level +"\n" ;
        return info;
    }
}

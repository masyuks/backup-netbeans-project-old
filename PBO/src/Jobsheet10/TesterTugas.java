package Jobsheet10;

public class TesterTugas {
    public static void main(String[] args) {
        walkingZombie wz = new walkingZombie (100, 1);
        jumpingZombie jz = new jumpingZombie(100, 2);
        Barrier b = new Barrier (100);
        Plant p = new Plant();
        
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("-------------------------");
        
        for(int i=0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println("" + wz.getZombieInfo());
        System.out.println("" + jz.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        
    }
}

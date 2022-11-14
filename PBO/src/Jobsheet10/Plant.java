package Jobsheet10;

public class Plant {
    
    public void doDestroy(Destroyable d){
        if (d instanceof walkingZombie) {
            walkingZombie wz = (walkingZombie) d;
            wz.destroyed();
        } else if (d instanceof jumpingZombie) {
            jumpingZombie jz = (jumpingZombie) d;
            jz.destroyed();
        } else if (d instanceof Barrier) {
            Barrier b = (Barrier) d;
            b.destroyed();
        }
    }
}

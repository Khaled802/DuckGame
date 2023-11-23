package flying;

public class NoFlying implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("Cannot fly!");
    }
    
}

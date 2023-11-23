package ducks;

import flying.NoFlying;
import quacking.Quack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyingBehavior = new NoFlying();
        quackingBehavior = new Quack();
    }

    @Override
    public void display() {
       System.out.println("It is Decoy Duck");
    }
    
}

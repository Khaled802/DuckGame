package ducks;

import flying.FlyWithWings;
import quacking.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyingBehavior = new FlyWithWings();
        this.quackingBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is Mallard duck");
    }
    
}

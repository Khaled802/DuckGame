package ducks;

import flying.NoFlying;
import quacking.Squack;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyingBehavior = new NoFlying();
        quackingBehavior = new Squack();
    }

    @Override
    public void display() {
        System.out.println("It is Rubber Duck");
    }

}

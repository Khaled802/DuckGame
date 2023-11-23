package ducks;

import flying.NoFlying;
import quacking.MuteQuack;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyingBehavior = new NoFlying();
        quackingBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("It is a Wooden Duck");
    } 
}

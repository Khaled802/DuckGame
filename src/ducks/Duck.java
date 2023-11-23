package ducks;

import flying.FlyingBehavior;
import quacking.QuackingBehavior;

public abstract class Duck {

    protected FlyingBehavior flyingBehavior;
    protected QuackingBehavior quackingBehavior;

    public void swim() {
        System.out.println("the duck is swimming");
    }

    abstract public void display();

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void setQuackingBehavior(QuackingBehavior quackingBehavior) {
        this.quackingBehavior = quackingBehavior;
    }

    public void performFly() {
        this.flyingBehavior.fly();
    }

    public void performQuack() {
        this.quackingBehavior.quack();
    }
}

import java.util.List;

import ducks.Duck;
import ducks.MallardDuck;
import ducks.RubberDuck;
import ducks.WoodenDuck;
import flying.FlyingWithRocket;
import ducks.DecoyDuck;

public class App {
    public static void main(String[] args) throws Exception {
        List<Duck> ducks = List.of(
            new MallardDuck(),
            new RubberDuck(),
            new WoodenDuck(),
            new DecoyDuck()
        );


        for (Duck duck : ducks) {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();
            System.out.println(" --------------------- ");
        }

        ducks.get(0).setFlyingBehavior(new FlyingWithRocket());
        System.out.println("Now Mallaed can fly with rocket:");
        ducks.get(0).performFly(); 
    }
}

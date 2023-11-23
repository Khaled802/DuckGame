package quacking;

public class MuteQuack implements QuackingBehavior {

    @Override
    public void quack() {
        System.out.println();
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public int getVolume() {
        return 0;
    }
    
}

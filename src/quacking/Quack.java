package quacking;

public class Quack implements QuackingBehavior{
    private int volume = QuackingBehavior.DEFAULT_QUACK_VOLUME;
    static final int MAX_VALUME = 100;

    @Override
    public void quack() {
        for (int i = 0; i < volume/10; i++) {
            System.out.print("Quack ");
        }
        System.out.println();
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VALUME) volume = MAX_VALUME;
        if (volume < 0) volume = 0;
        this.volume = volume;
    }

    @Override
    public int getVolume() {
       return this.volume;
    }
    
}

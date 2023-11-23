package quacking;

public class Squack implements QuackingBehavior {

    static final int MAX_VALUME = 50;
    private int volume = QuackingBehavior.DEFAULT_QUACK_VOLUME;

    @Override
    public void quack() {
        for (int i = 0; i < volume/5; i++) {
            System.out.print("Squack ");
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

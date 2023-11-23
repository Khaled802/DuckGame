package quacking;

public interface QuackingBehavior {
    static final int DEFAULT_QUACK_VOLUME = 10;

    void quack();
    void setVolume(int volume);
    int getVolume();
}

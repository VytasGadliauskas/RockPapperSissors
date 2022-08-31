package lt.bit.zaidimas;

public enum GameEnum {
    ROCK(0),
    PAPPER(1),
    SISSORS(2);

    public final int value;

    GameEnum(int value) {
        this.value = value;
    }
}

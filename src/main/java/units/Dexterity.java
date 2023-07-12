package units;

public abstract class Dexterity extends Unit {

    public int accuracy;
    public int skill;
    public Dexterity(String name, int x, int y) {

        super(name, 100, 10, 1, x, y);
    }
}

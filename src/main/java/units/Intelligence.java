package units;

public abstract class Intelligence extends Unit {
    public int mana;
    public int treatment;
    public Intelligence(String name, int x, int y) {

        super(name, 200, 0, 2, x, y);
    }
}

package units;

public abstract class Power extends Unit {
    public int defense;
    public int force;
    public Power(String name, int x, int y) {

        super(name, 150, 20, 1, x, y);
    }
}

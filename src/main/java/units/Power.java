package units;

import java.util.ArrayList;

public abstract class Power extends Unit {
    public int defense;
    public int force;
    public Power(String name, int x, int y) {

        super(name, 150, 150, 20, 1, x, y);
    }

    @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {
        if(isAlive) return;

        Unit tmp = getNearest(units); // Найти ближайшего противника
        System.out.println("Ближайший противник к " + name + ", " + tmp.name + " " + coordinates.getDistance(tmp.coordinates));

        doAttack(tmp);

    }
}

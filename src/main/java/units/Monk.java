package units;

import java.util.ArrayList;
import java.util.Random;

public class Monk extends Intelligence {
    public Monk(String name, int x, int y) {
        super(name, x, y);
        super.mana = new Random().nextInt(50, 100);
        super.treatment = new Random().nextInt(20, 50);
        super.actionPoint = 4;
    }


    @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {
        Unit tmp = getNearest(units);
        System.out.println("Ближайший к монаху " + name + ", " + tmp.name + " " + coordinates.getDistance(tmp.coordinates));
    }




    @Override
    public String getInfo() {
        return "Монах " + name + ": (здоровье - "
                + health + ")";

    }
}

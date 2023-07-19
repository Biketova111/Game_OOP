package units;

import java.util.ArrayList;
import java.util.Random;

public class Magician extends Intelligence {
    public Magician(String name, int x, int y) {
        super(name, x, y);
        super.mana = new Random().nextInt(100, 150);
        super.treatment = new Random().nextInt(10, 20);
    }

   @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {
        Unit tmp = getNearest(units);
        System.out.println("Ближайший к магу " + name + ", " + tmp.name + " " + coordinates.getDistance(tmp.coordinates));
    }





    @Override
    public String getInfo() {
        return "Маг " + name + ": (здоровье - "
                + health + ")";

    }
}


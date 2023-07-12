package units;

import java.util.ArrayList;
import java.util.Random;

public class Sniper extends Dexterity {
    public Sniper(String name, int x, int y) {
        super(name, x, y);
        super.accuracy = new Random().nextInt(50, 100);
        super.skill = new Random().nextInt(50);
        super.health = new Random().nextInt(100, 200);
    }

   @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = getNearest(units);
        System.out.println(tmp.name + " " + coordinates.getDistance(tmp.coordinates));
    }



    @Override
    public String getInfo() {
        return "Снайпер " + name
                + ": (" + coordinates.x + ";" + coordinates.y + ");";

    }
}

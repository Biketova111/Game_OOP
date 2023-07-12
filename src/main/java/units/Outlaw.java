package units;

import java.util.ArrayList;
import java.util.Random;

public class Outlaw extends Power {
    public Outlaw(String name, int x, int y) {
        super(name, x, y);
        super.damage = new Random().nextInt(50);
        super.force = new Random().nextInt(5, 20);

    }

   @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = getNearest(units);
        System.out.println(tmp.name + " " + coordinates.getDistance(tmp.coordinates));
    }



    @Override
    public String getInfo() {
        return "Разбойник " + name
                + ": (" + coordinates.x + ";" + coordinates.y + ");";

    }
}

package units;

import java.util.ArrayList;
import java.util.Random;

public class Spearman extends Power {
    public Spearman(String name, int x, int y) {
        super(name, x, y);
        super.damage = new Random().nextInt(50, 100);
        super.force = new Random().nextInt(1, 10);
        super.health = new Random().nextInt(150, 200);
    }


    @Override
    public String getInfo() {
        return "Копейщик " + name
                + ": (" + coordinates.x + ";" + coordinates.y + ");";
    }

    @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = getNearest(units);
        System.out.println(tmp.name + " " + coordinates.getDistance(tmp.coordinates));
    }

}

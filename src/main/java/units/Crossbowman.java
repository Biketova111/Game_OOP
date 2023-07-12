package units;

import java.util.ArrayList;
import java.util.Random;

public class Crossbowman extends Dexterity {

    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
        super.accuracy = new Random().nextInt(50);
        super.skill = new Random().nextInt(50, 100);
    }


        @Override
    public String getInfo() {
        return "Арбалетчик " + name
                + ": ("
                + coordinates.x + ";"
                + coordinates.y + ");";

    }

    @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = getNearest(units);
        System.out.println(tmp.name + " " + coordinates.getDistance(tmp.coordinates));
    }


}


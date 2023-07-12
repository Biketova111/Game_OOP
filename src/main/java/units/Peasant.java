package units;

import java.util.ArrayList;

public class Peasant extends Unit {
    public Peasant(String name, int x, int y) {
        super(name, 50, 0, 1, x, y);
    }


    @Override
    public void step(ArrayList<Unit> units) {
        Unit tmp = getNearest(units);
        System.out.println(tmp.name + " " + coordinates.getDistance(tmp.coordinates));
    }



    @Override
    public String getInfo() {
        return "Крестьянин " + name
                + ": (" + coordinates.x + ";" + coordinates.y + ");";
    }
}


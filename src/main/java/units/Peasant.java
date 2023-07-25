package units;

import java.util.ArrayList;

public class Peasant extends Unit {
    public Peasant(ArrayList<Unit> team1, String name, int x, int y) {
        super(name, 50, 50, 0, 1, x, y);
    }



    @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {
        Unit tmp = getNearest(units);


    }

    @Override
    public String getInfo() {
        return "Крестьянин " + name+ ": (здоровье - "
                + health + ")";

    }
}


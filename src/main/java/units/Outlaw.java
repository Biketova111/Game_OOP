package units;

import java.util.ArrayList;
import java.util.Random;

public class Outlaw extends Power {
    public Outlaw(ArrayList<Unit> team1, String name, int x, int y) {
        super(name, x, y, 2, 1);
        super.attacksAmount = 2;
        super.attackRange = 1;

    }




    @Override
    public String getInfo() {
        return "Разбойник " + name
                + " [" + coordinates.x + ", " + coordinates.y + "]"
                + ": (здоровье: " + health
                + "/" + max_health
                + "; статус: " + state
                +  ")";

    }
}

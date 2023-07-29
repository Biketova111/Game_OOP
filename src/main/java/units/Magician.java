package units;

import java.util.ArrayList;
import java.util.Random;

public class Magician extends Intelligence {
    public Magician(ArrayList<Unit> team2, String name, int x, int y) {
        super(name, x, y);
        super.mana = new Random().nextInt(100, 150);
        super.treatment = new Random().nextInt(10, 20);
    }


    @Override
    public String getInfo() {
        return "Маг " + name+
        " [" + coordinates.x + ", " + coordinates.y + "]"
                + ": (здоровье: " + health
                + "/" + max_health
                + "; статус: " + state
                + "; мана: "
                + mana + ")";

    }
}


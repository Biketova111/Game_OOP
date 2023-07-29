package units;

import java.util.ArrayList;
import java.util.Random;

public class Monk extends Intelligence {
    public Monk(ArrayList<Unit> team1, String name, int x, int y) {
        super(name, x, y);
        super.mana = new Random().nextInt(50, 100);
        super.treatment = new Random().nextInt(20, 50);
        super.actionPoint = 4;
    }



    @Override
    public String getInfo() {
        return "Монах " + name + " [" + coordinates.x + ", " + coordinates.y + "]"
                + ": (здоровье: " + health
                + "/" + max_health
                + "; статус: " + state
                + "; мана: "
                + mana + ")";

    }
}

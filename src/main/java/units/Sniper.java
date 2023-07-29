package units;

import java.util.ArrayList;
import java.util.Random;

public class Sniper extends Dexterity {
    public Sniper(ArrayList<Unit> team1, String name, int x, int y) {
        super(name, x, y);
        super.accuracy = new Random().nextInt(50, 100);
        super.skill = new Random().nextInt(50);
        super.arrow = 30;
    }



    @Override
    public String getInfo() {
        return "Снайпер " + name
                + " [" + coordinates.x + ", " + coordinates.y + "]"
                + ": (здоровье: " + health
                + "/" + max_health
                + "; статус: " + state
                + "; колличество стрел: "
                + arrow + ")";

    }
}

package units;

import java.util.ArrayList;
import java.util.Random;

public class Outlaw extends Power {
    public Outlaw(ArrayList<Unit> team1, String name, int x, int y) {
        super(name, x, y);
        super.force = new Random().nextInt(5, 20);

    }




    @Override
    public String getInfo() {
        return "Разбойник " + name
                + ": (здоровье - "
                + health+ ")";

    }
}

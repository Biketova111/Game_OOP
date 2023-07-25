package units;

import java.util.ArrayList;
import java.util.Random;

public class Spearman extends Power {
    public Spearman(ArrayList<Unit> team2, String name, int x, int y) {
        super(name, x, y);
        super.force = new Random().nextInt(1, 10);

    }


    @Override
    public String getInfo() {
        return "Копейщик " + name
                + ": (здоровье - "
                + health+ ")";
    }




}

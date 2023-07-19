package units;

import java.util.ArrayList;
import java.util.Random;

public class Outlaw extends Power {
    public Outlaw(String name, int x, int y) {
        super(name, x, y);
        super.force = new Random().nextInt(5, 20);

    }

   @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {
        Unit tmp = getNearest(units); // Найти ближайшего противника
        System.out.println("Ближайший к разбойнику " + name + ", " + tmp.name + " " + coordinates.getDistance(tmp.coordinates));
    }



    @Override
    public String getInfo() {
        return "Разбойник " + name
                + ": (здоровье - "
                + health+ ")";

    }
}

package units;

import java.util.ArrayList;
import java.util.Random;

public class Spearman extends Power {
    public Spearman(String name, int x, int y) {
        super(name, x, y);
        super.force = new Random().nextInt(1, 10);

    }


    @Override
    public String getInfo() {
        return "Копейщик " + name
                + ": (здоровье - "
                + health+ ")";
    }

    @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {


        Unit tmp = getNearest(units); // Найти ближайшего противника
        System.out.println("Ближайший к копейщику " + name + ", " + tmp.name + " " + coordinates.getDistance(tmp.coordinates));



    }


}

package units;

import java.util.ArrayList;
import java.util.Random;

public class Crossbowman extends Dexterity {

    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
        super.accuracy = new Random().nextInt(50);
        super.skill = new Random().nextInt(50, 100);
        super.arrow = 50;
    }


    @Override
    public String getInfo() {
        return "Арбалетчик " + name
                + ": (здоровье - "
                + health + "; колличество стрел - " + arrow + ")";

    }

    @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {
        if (this.health == 0 || this.arrow == 0) return; // Если жизней 0 или стрел 0 вернуть управление


        Unit tmp = getNearest(units); // Найти ближайшего противника
        System.out.println("Ближайший к арбалетчик " + name + ", " + tmp.name + " " + coordinates.getDistance(tmp.coordinates));

        doAttack(tmp); // Нанесение урона

        if (team.contains(Peasant.class)) {
            return;
        }


    }

}
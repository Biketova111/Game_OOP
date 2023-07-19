package units;

import java.util.ArrayList;
import java.util.Random;

public class Sniper extends Dexterity {
    public Sniper(String name, int x, int y) {
        super(name, x, y);
        super.accuracy = new Random().nextInt(50, 100);
        super.skill = new Random().nextInt(50);
        super.arrow = 30;
    }

   @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {

        if (this.health == 0 || this.arrow == 0) return; // Если жизней 0 или стрел 0 вернуть управление
        Unit tmp = getNearest(units); // Найти ближайшего противника
        System.out.println("Ближайший к снайперу " + name + ", " + tmp.name + " " + coordinates.getDistance(tmp.coordinates));

        doAttack(tmp); // Нанесение урона


           if (team.contains(Peasant.class)) {
               return;
           }

       }

    @Override
    public String getInfo() {
        return "Снайпер " + name
                + ": (здоровье - "
                + health + "; колличество стрел - " + arrow+ ")";

    }
}

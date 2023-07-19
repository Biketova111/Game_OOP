package units;

import java.util.ArrayList;

public abstract class Dexterity extends Unit {

    public int accuracy;
    public int arrow;
    public int skill;
    public Dexterity(String name, int x, int y) {

        super(name, 100,  10, 1, x, y);
    }


    @Override
    public void doAttack(Unit target) {
        super.doAttack(target);
        arrow--; // Нанисение урона и расход одной стрелы
    }

    @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {

        if (this.health == 0 || this.arrow == 0) return; // Если жизней 0 или стрел 0 вернуть управление
        Unit tmp = getNearest(units); // Найти ближайшего противника
        System.out.println("Ближайший к снайперу " + name + ", " + tmp.name + " " + coordinates.getDistance(tmp.coordinates));

        doAttack(tmp); // Нанесение урона




        }

    }





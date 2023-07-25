package units;

import java.util.ArrayList;

public abstract class Intelligence extends Unit {

    public int mana;
    public int treatment;
    public Intelligence(String name, int x, int y) {

        super(name, 200,200, 0, 2, x, y);
    }


    @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {
        if (isAlive) return;
        double tmpMinHeals = 1;
        Unit tmpHealth = team.get(0);

        for (Unit unit : team) {
            if ((double) unit.health / unit.max_health < tmpMinHeals) {
                tmpMinHeals = (double) unit.health / unit.max_health;

            }
            if (tmpMinHeals<1) {
                getHp();
                unit.state = "Busy";
                System.out.println(name + " Лечит " + unit.name);
             // Поиск больного и лечение
            }
            else return;
        }



    }
    }



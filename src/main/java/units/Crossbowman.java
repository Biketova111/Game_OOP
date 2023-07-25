package units;

import java.util.ArrayList;
import java.util.Random;

public class Crossbowman extends Dexterity {

    public Crossbowman(ArrayList<Unit> team2, String name, int x, int y) {
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




}
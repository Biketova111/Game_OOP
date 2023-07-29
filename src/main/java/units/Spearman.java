package units;

import java.util.ArrayList;
import java.util.Random;

public class Spearman extends Power {
    public Spearman(ArrayList<Unit> team2, String name, int x, int y) {
        super(name, x, y, 1, 2);
        super.attacksAmount = 1;
        super.attackRange = 2;


    }


    @Override
    public String getInfo() {
        return "Копейщик " + name
                + " [" + coordinates.x + ", " + coordinates.y + "]"
                + ": (здоровье: " + health
                + "/" + max_health
                + "; статус: " + state
                +  ")";
    }




}

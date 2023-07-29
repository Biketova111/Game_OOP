package units;

import java.util.ArrayList;

public abstract class Power extends Unit {
    public int attacksAmount, attackRange;
    public Power(String name, int x, int y, int attackRange, int attacksAmount) {

        super(name, 150, 150, 20, 1, x, y);
        this.attackRange = attackRange;
        this.attacksAmount = attacksAmount;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> team) {
        if(isAlive) return;

        Unit tmp = getNearest(enemy); // Найти ближайшего противника
        if (coordinates.getDistance(tmp.coordinates)<= attackRange){
            for (int i = 0; i<attacksAmount; i ++) tmp.getDamage(damage);
            state = "Attack";
            }



    }
}

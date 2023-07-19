package units;

import java.util.ArrayList;

public abstract class Unit implements gameInterface {

    public String name;
    public int health;

   public int damage;
    public int actionPoint;

    Coordinates coordinates;

    public Unit(String name, int health, int damage, int actionPoint, int x, int y) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.actionPoint = actionPoint;
        coordinates = new Coordinates(x, y);
    }

  @Override
    public void step(ArrayList<Unit> units, ArrayList<Unit> team) {

    }

    public Unit getNearest(ArrayList<Unit> units) {
        double nearestDistance = Double.MAX_VALUE;
        Unit nearestEnemy = null;
        for (int i = 0; i < units.size(); i++) {
            if (coordinates.getDistance(units.get(i).coordinates) < nearestDistance) {
                nearestEnemy = units.get(i);
                nearestDistance = coordinates.getDistance(units.get(i).coordinates);
            }
        }
        return nearestEnemy;
    }

    public void doAttack (Unit target) {
        if (health>0) {
            target.getDamage(damage);
        }
    }

    public void getDamage(int damage) {
        if (health - damage> 0) {
            health -=damage;
        }
        else {
            health=0;
        }
    }


}


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
    public void step(ArrayList<Unit> units) {

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


}


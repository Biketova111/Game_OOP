package units;

import java.util.ArrayList;

public abstract class Unit implements gameInterface {

    public String name;
    public int health, max_health;

    public int damage;
    public int actionPoint;
    public boolean isAlive;

    Coordinates coordinates;

    public String state = "Stand";

    public int mana;



    public Unit(String name, int health, int max_heal, int damage, int actionPoint, int x, int y) {
        this.name = name;
        this.health = health;
        this.max_health = max_health;
        this.damage = damage;
        this.actionPoint = actionPoint;

    }

    public ArrayList<Integer> getCoords() {
        return coordinates.xy;
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

    public void doAttack(Unit target) {
        if (health > 0) {
            target.getDamage(damage);
        }
    }

    public void getDamage(int damage) {
        if (health - damage > 0) {
            health -= damage;
        } else {
            health = 0;
            state = "Dead";
        }
    }

    public void getHp () {
        while (health<max_health)
            health = health+mana;
        if (health>max_health) {
            health = max_health;
        }
    }





}



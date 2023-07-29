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
    public int moveDistance;



    public Unit(String name, int health, int max_health, int damage, int actionPoint, int x, int y, int moveDistance) {
        this.name = name;
        this.health = health;
        this.max_health = max_health;
        this.damage = damage;
        this.actionPoint = actionPoint;
        coordinates = new Coordinates(x, y);
        this.moveDistance = moveDistance;


    }

    public ArrayList<Integer> getCoords() {
        return coordinates.xy;
    }

    public void move(Coordinates targetPosition, ArrayList<Unit> team) {
        if (!coordinates.containsByPos(coordinates.newPosition(targetPosition, team), team)) {
            for (int i = 0; i < moveDistance; i++) {
                coordinates = coordinates.newPosition(targetPosition, team);
            }
        }


       public Unit getNearest(ArrayList<Unit> units) {
            double minDistance = Double.MAX_VALUE;
            Unit nearestEnemy = null;
            for (int i = 0; i < units.size(); i++) {
                if (coordinates.getDistance(units.get(i).coordinates) < minDistance && units.get(i).isAlive) {
                nearestEnemy = units.get(i);
                minDistance = coordinates.getDistance(units.get(i).coordinates);
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
        health -= damage;
        if (health <= 0) {
            health = 0;
            state = "Dead";
            isAlive = false;
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



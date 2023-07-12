import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Team 1:");
        ArrayList<Unit> team1  = new ArrayList<>();
        team1.add(new Outlaw(getName(), 0, 1));
        team1.add(new Sniper(getName(), 0, 2));
        team1.add(new Monk(getName(), 0, 3));
        team1.add(new Peasant(getName(), 0, 4));
        team1.get(0).getInfo();
        team1.forEach(n-> System.out.println(n.getInfo()));


        System.out.println();


        System.out.println("Team 2:");
        ArrayList<Unit> team2  = new ArrayList<>();
        team2.add(new Spearman(getName(), 5, 1));
        team2.add(new Crossbowman(getName(), 5, 2));
        team2.add(new Magician(getName(), 5, 3));
        team2.add(new Peasant(getName(), 5, 4));
        team2.get(0).getInfo();
        team2.forEach(n-> System.out.println(n.getInfo()));

        System.out.println();

        System.out.println("The nearest:");
        
        team1.forEach(n -> n.step(team2));

    }

    public static String getName() {
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }



}





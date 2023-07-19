import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Team 1:");
        ArrayList<Unit> team1  = new ArrayList<>();
        team1.add(new Outlaw(getName(), new Random().nextInt(10), new Random().nextInt(10)));
        team1.add(new Monk(getName(), new Random().nextInt(10), new Random().nextInt(10)));
        team1.add(new Peasant(getName(), new Random().nextInt(10), new Random().nextInt(10)));
        team1.add(new Sniper(getName(), new Random().nextInt(10), new Random().nextInt(10)));


        team1.get(0).getInfo();
        team1.forEach(n-> System.out.println(n.getInfo()));

        System.out.println();

        System.out.println("Team 2:");
        ArrayList<Unit> team2  = new ArrayList<>();
        team2.add(new Spearman(getName(), new Random().nextInt(10), new Random().nextInt(10)));
        team2.add(new Crossbowman(getName(), new Random().nextInt(10), new Random().nextInt(10)));
        team2.add(new Magician(getName(), new Random().nextInt(10), new Random().nextInt(10)));
        team2.add(new Peasant(getName(), new Random().nextInt(10), new Random().nextInt(10)));


        team2.get(0).getInfo();
        team2.forEach(n-> System.out.println(n.getInfo()));


        System.out.println();

        System.out.println("Ближайшие:");
        team1.forEach(n-> n.step(team2, team1));
        System.out.println();
        team2.forEach(n-> n.step(team1, team2));
        System.out.println();

        System.out.println("Результат атаки:");
        team1.forEach(n-> System.out.println(n.getInfo()));



        System.out.println();
        team2.forEach(n-> System.out.println(n.getInfo()));


    }

    public static String getName() {
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }



}





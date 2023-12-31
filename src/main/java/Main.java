import units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<Unit> team1 = new ArrayList<>();
    public static ArrayList<Unit> team2 = new ArrayList<>();
    public static ArrayList<Unit> allTeam = new ArrayList<>();


    public static void main(String[] args) {

         int teamSize = 10;

         for (int i=1; i<teamSize+1; i++) {
             switch (new Random().nextInt(1,5)) {
                 case 1:
                     team1.add(new Outlaw(team1, getName(), 1, i));
                     break;
                 case 2:
                     team1.add(new Monk(team1, getName(), 1, i));
                     break;
                 case 3:
                     team1.add(new Sniper(team1, getName(), 1, i));
                     break;
                 case 4:
                     team1.add(new Peasant(team1, getName(), 1, i));
                     break;
             }

         }

        for (int i=1; i<teamSize+1; i++) {
            switch (new Random().nextInt(1,5)) {
                case 1:
                    team2.add(new Spearman(team2, getName(), 10, i));
                    break;
                case 2:
                    team2.add(new Magician(team2, getName(), 10, i));
                    break;
                case 3:
                    team2.add(new Crossbowman(team2, getName(), 10, i));
                    break;
                case 4:
                    team2.add(new Peasant(team2, getName(), 10, i));
                    break;
            }

        }


        allTeam.addAll(team1);
        allTeam.addAll(team2);



        Scanner in = new Scanner(System.in);
        View.view();
        in.nextLine();



    }

    public static String getName() {
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }



}





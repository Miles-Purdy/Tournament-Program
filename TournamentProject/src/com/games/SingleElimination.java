package com.games;

import java.util.ArrayList;
import java.util.Scanner;

public class SingleElimination {


    private int numberOfCombatants;
    private String namesOfCombatants;

    public int numOfFighters = 0;
    public int numOfWins = 0;


    ArrayList<Fighters> singelEliminationBracket = new ArrayList<Fighters>();
    String fighter1;
    String fighter2;

    Scanner scanner = new Scanner(System.in);

    public SingleElimination() {

    }


    public int , String bracketSetup() {
        while (((numOfFighters % 2) != 0) || (numOfWins == 0)) {
            System.out.println("Enter the number of teams (must be even):");
            numOfFighters = scanner.nextInt();
            scanner.nextLine();
        }
        return

    }
    // maybe use a queue to attach player names to the number of combatants in that order? Might have issues but seems interesting.








}

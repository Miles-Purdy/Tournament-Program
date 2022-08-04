package com.games;

import java.util.Scanner;

/**
 * The Tournament Selector
 *
 * What's the plan man?
 *
 * To build a program that lets you select what kind of tournament you are going to run,
 * how many fighters in the tournament, and the scoring rules as dependent upon
 * the rules of each type of tournament.
 *
 * This needs to include the flexibility of adding and dropping fencers mid round, buys, and odd numbers for the final round
 *
 * The program also should work outside of the terminal, and input as needed.
 *
 * So, we're going to have a main class that is "Tournament"
 * Subclasses that are the kind of tournament,
 * which will define the point structure, as well as who fights who
 *
 * fighters should probably be in randomized in some cases
 *              Add option for "rank" under special rules (checkbox???)
 *-------------------------------------------------------------------------------------
 * Ask for type of tournament, and ask if there are any additional rules
 *
 * The main class should take who is fighting,
 * and put them into a string list/map/array (likely map but need to test)
 *
 * Begin round
 *
 * Ask who won the fights.
 *          The real problem here will be what to ask/ what kind of input can be taken.
 *          It doesn't make much sense to ask who won the fight in order,
 *          As it rarely works that way. Typically, the fight that finished
 *          first is the one that reports first, and that's not always the first fight out.
 *
 *          It makes more sense to be able to input a string, or better yet, a selector
 *          that lets you choose "who won: James or Miles?" and then click the name.
 *
 * Depending on the rules, we'd start a new round, either with just the winners,
 * winners and losers bracket, or just continuously update the points as they are
 * received until the marshall declares the tournament ended (like a round-robin).
 *-----------------------------------------------------------------------------------------
 *
 *Best to start with only one functioning tournament at a time.
 * Start with the easiest to implement,
 * and build upon it as it goes.
 * This means there should be at least two classes:
 * the main "Tournament Program" and the kind of tournament.
 * That being said, a third class defining tournaments wouldn't hurt.
 *
 * Refer to the OldMacdonald and CardGame exercises for ideas of how to approach it.
 *
 *
 *-------------------------------------------------------------------------------------------
 * Rather than trying to build it here, why not use a SQL databse to create and store the players? then i could pull and update
 * the database according to what the tournament was without having to create a new list every time a new round
 * started up.
 *
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tournament tournament = new Tournament();
        SingleElimination singleElimination = new SingleElimination();

        System.out.println("Welcome to Tourney Manager");
        System.out.println("What kind of tournament are you running:");
        Scanner systemInput = new Scanner(System.in);

        String selectedTournament = systemInput.nextLine();

        //Boots a tournament format based on the appropriate selection

        if (selectedTournament.equalsIgnoreCase("Single Elimination")) {
            System.out.println("You have selected 'Single Elimination'" );
            System.out.println("Is this correct? Y/N");
            String yesOrNo = systemInput.nextLine();
            if (yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("Yes")) {

    // call on the single elimination tournament
            singleElimination.bracketSetup();
            }
            if (yesOrNo.equalsIgnoreCase("N") || yesOrNo.equalsIgnoreCase("No")) {
                //loop to the beginning is the end goal, for now exit the program
                System.exit(1);
            }
        }






    }
}

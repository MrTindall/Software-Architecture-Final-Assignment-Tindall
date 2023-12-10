package edu.wctc.General;

import edu.wctc.Model.Classes.Character;
import edu.wctc.Model.Classes.CharacterClass;

import java.util.Scanner;


public class Game {
    private static Game instance;
    private Scanner keyboard;

    private Game(){
        keyboard = new Scanner(System.in);
    }
    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
    public boolean isGameDone(Character a, Character b) {
        return a.getHealth() > 0 && b.getHealth() > 0;
    }

    public void fight(Character a, Character b) {
        while (a.isAlive() && b.isAlive()) {
            displayOptions(); // Display available actions
            String actionA = getUserInput("Player A, choose your action: ");
            String actionB = getUserInput("Player B, choose your action: ");

            performRound(a, b, actionA, actionB); // Execute the round based on player actions
        }

        // Determine the winner after the fight ends
        if (a.isAlive()) {
            System.out.println(a.getName() + " wins!");
        } else {
            System.out.println(b.getName() + " wins!");
        }
    }



    private String getUserInput(String prompt) {
        System.out.print(prompt);
        return keyboard.nextLine().trim().toLowerCase(); // Get user input for action
    }

//    private void performRound(Character attacker, Character defender, String attackerAction, String defenderAction) {
//        // Logic for a single combat round based on player actions
//        if (attackerAction.equals("1")) {
//            attacker.lightAttack(defender);
//        } else if (attackerAction.equals("2")) {
//            attacker.heavyAttack(defender);
//        } else if (attackerAction.equals("3")) {
//            attacker.defendStrategy();
//        }
//    }
}

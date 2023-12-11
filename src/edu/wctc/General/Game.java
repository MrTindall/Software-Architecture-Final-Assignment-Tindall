package edu.wctc.General;

import edu.wctc.Model.Classes.Character;
import edu.wctc.Model.Classes.CharacterClass;
import edu.wctc.Model.Interfaces.Moves;

import java.util.Random;
import java.util.Scanner;


public class Game {
    private static Game instance;
    private Scanner keyboard;
    Ui ui = new Ui();

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

            performRound(a, b); // Execute the round based on player actions
        }

        // Determine the winner after the fight ends
        if (a.isAlive()) {
            System.out.println(a.getName() + " wins!");
        } else {
            System.out.println(b.getName() + " wins!");
        }
    }

    boolean characterAUsedHeavyAttack = false;
    boolean characterBUsedHeavyAttack = false;

    private void performRound(Character characterA, Character characterB) {

        System.out.println();
        System.out.println(characterA.getCharacterClass().getName() + " " + characterA.getName() + " HP: " + characterA.getHealth());
        System.out.println(characterB.getCharacterClass().getName() + " " + characterB.getName() + " HP: " + characterB.getHealth());


        int characterAMove = 0;
        int characterBMove = 0;
        if(characterAUsedHeavyAttack == true){
            characterAUsedHeavyAttack = false;
        }
        if(characterBUsedHeavyAttack == true){
            characterBUsedHeavyAttack = false;
        }

        String actionA = ui.getMove(); // Get action for Character A

// Character A's action
        if (characterAUsedHeavyAttack == true) {
            System.out.println(characterB.getName() + " used a heavy attack. Next turn skipped.");

        } else {
            if (actionA.equals("1")) {
                characterAMove = characterA.getCharacterClass().lightAttack.lightAttack();
            } else if (actionA.equals("2")) {
                characterAMove = characterA.getCharacterClass().heavyAttack.heavyAttack();
                characterAUsedHeavyAttack = true; // Set heavy attack flag for Character A
            } else if (actionA.equals("3")) {
                characterAMove = 0; // Character A is defending
            }
        }


// Character B's action (AI action)
        String actionB = generateRandomAction(); // Get AI action for Character B
        if(characterBUsedHeavyAttack == true) {
            System.out.println(characterA.getName() + " used a heavy attack. Next turn skipped.");
        } else {
            if (actionB.equals("1")) {
                characterBMove = characterB.getCharacterClass().lightAttack.lightAttack();
            } else if (actionB.equals("2")) {
                characterBMove = characterB.getCharacterClass().heavyAttack.heavyAttack();
                characterBUsedHeavyAttack = true; // Set heavy attack flag for Character A
            } else if (actionB.equals("3")) {
                characterBMove = 0; // Character B is defending
            }
        }


// Check different combinations of actions and apply defend strategy
        if (actionA.equals("3") && actionB.equals("3")) {
            System.out.println("Both Defended");
            System.out.println("0 Damage done");
        } else if (actionA.equals("3") && !actionB.equals("3")) {
            System.out.println(characterA.getName() + " Defended");
            System.out.println(characterB.getName() + " Attacked");

            characterBMove = characterB.getCharacterClass().defendStrategy.defendStrategy(characterBMove);
        } else if (!actionA.equals("3") && actionB.equals("3")) {
            System.out.println(characterA.getName() + " Attacked");
            System.out.println(characterB.getName() + " Defended");

            characterAMove = characterA.getCharacterClass().defendStrategy.defendStrategy(characterAMove);
        }

// Deduct health based on the moves
        characterA.setHealth(characterA.getHealth() - characterBMove);
        characterB.setHealth(characterB.getHealth() - characterAMove);

// Display the impact of the moves on health
        System.out.println();
        System.out.println(characterA.getCharacterClass().getName() + " " + characterA.getName() + " took " + characterBMove + " damage.");
        System.out.println(characterB.getCharacterClass().getName() + " " + characterB.getName() + " took " + characterAMove + " damage.");


    }


    private String generateRandomAction() {
            Random random = new Random();
            int randomAction = random.nextInt(3) + 1;
            return String.valueOf(randomAction);
    }
}


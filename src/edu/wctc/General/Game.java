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


    private void performRound(Character characterA, Character characterB) {


        int characterAMove= 0;
        int characterBMove = 0;

        String actionA = ui.getMove();

        // Character A's action
        if (actionA.equals("1")) {
            characterAMove = characterB.getCharacterClass().lightAttack.lightAttack();
        } else if (actionA.equals("2")) {
            characterAMove = characterB.getCharacterClass().heavyAttack.heavyAttack();
        } else if (actionA.equals("3")) {
            characterAMove = characterB.getCharacterClass().defendStrategy.defendStrategy(characterBMove);
        }

        // Character B's action (AI action)
        String actionB = generateRandomAction();
        if (actionB.equals("1")) {
           characterBMove = characterB.getCharacterClass().lightAttack.lightAttack();
        } else if (actionB.equals("2")) {
            characterBMove = characterB.getCharacterClass().heavyAttack.heavyAttack();
        } else if (actionB.equals("3")) {
            characterBMove = characterB.getCharacterClass().defendStrategy.defendStrategy(characterAMove);
        }
        if (actionA == "3" && actionB == "3")
        {
            System.out.println("0 Damage done");
        }
        else {
            characterA.setHealth(characterA.getHealth() - characterAMove);
            characterA.setHealth(characterB.getHealth() - characterBMove);
        }

    }


    private String generateRandomAction() {
            Random random = new Random();
            int randomAction = random.nextInt(3) + 1;
            return String.valueOf(randomAction);
    }
}


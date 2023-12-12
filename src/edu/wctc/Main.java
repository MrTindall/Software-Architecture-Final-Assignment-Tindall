package edu.wctc;

import edu.wctc.General.Game;
import edu.wctc.Model.Classes.Character;
import edu.wctc.Model.Classes.CharacterFactory;

public class Main {
    public static void main(String[] args) {

        // Creates new main and calls run method
        new Main().run();
    }

    // Run method that drives the whole system
    private void run() {

        // Creates a new game instance
        Game theGame = Game.getInstance();

        // Creates 2 players user character factory
        Character player1 = CharacterFactory.getCharacter();
        Character player2 = CharacterFactory.getCharacter();

        // Pits characters against each other until the game is over
        while (theGame.isGameDone(player1, player2)) {
            theGame.fight(player1, player2);
        }
    }
}

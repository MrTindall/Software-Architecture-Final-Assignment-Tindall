package edu.wctc;

import edu.wctc.General.Game;
import edu.wctc.Model.Classes.Character;
import edu.wctc.Model.Classes.CharacterFactory;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Game theGame = Game.getInstance();
        Character player1 = CharacterFactory.getCharacter();
        Character player2 = CharacterFactory.getCharacter();

        while (theGame.isGameDone(player1, player2)) {
            theGame.fight(player1, player2);
        }
    }
}

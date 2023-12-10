package edu.wctc.Model.Classes;

import edu.wctc.General.Ui;
import edu.wctc.Model.Interfaces.DefendStrategy;

public class CharacterFactory {
    private static Ui ui = new Ui();
    public static Character getCharacter() {
        String name = ui.getName();
        int health = 100;
        CharacterClass characterClass = ui.getCharacterClass();
        return  new Character(name, health, characterClass);
    }

}

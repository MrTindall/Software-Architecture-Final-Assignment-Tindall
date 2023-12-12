package edu.wctc.Model.Classes;

import edu.wctc.General.Ui;
import edu.wctc.Model.Interfaces.DefendStrategy;

// Factory for Character Creation
public class CharacterFactory {

    // Create Ui object
    private static Ui ui = new Ui();

    // get character method for character creation
    public static Character getCharacter() {
        String name = ui.getName();
        int health = 100;
        CharacterClass characterClass = ui.getCharacterClass();
        return  new Character(name, health, characterClass);
    }

}

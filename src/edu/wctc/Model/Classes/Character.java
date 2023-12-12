package edu.wctc.Model.Classes;

import edu.wctc.Model.Interfaces.DefendStrategy;
import edu.wctc.Model.Interfaces.HeavyAttack;
import edu.wctc.Model.Interfaces.LightAttack;

public class Character {

    // Fields
    private CharacterClass characterClass;
    private int health = 100;
    private String name;

    // Character constructor
    public Character(String name, int health, CharacterClass characterClass) {
        this.health = health;
        this.name = name;
        this.characterClass = characterClass;
    }

    // Gets the name of the character
    public String getName() {
        return name;
    }

    // Sets the name of the character
    public void setName(String name) {
        this.name = name;
    }

    // Gets the health of the character
    public int getHealth(){
        return health;
    }

    // Sets the health of the character
    public void setHealth(int health)
    {
        this.health = health;
    }

    // Checks to see if character is alive
    public boolean isAlive() {
        return health > 0;
    }

    // Gets the character class of the character
    public CharacterClass getCharacterClass() {
        return characterClass;
    }
}

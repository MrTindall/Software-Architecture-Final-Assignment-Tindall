package edu.wctc.Model.Classes;

import edu.wctc.Model.Interfaces.DefendStrategy;
import edu.wctc.Model.Interfaces.HeavyAttack;
import edu.wctc.Model.Interfaces.LightAttack;

public class Character {
    private CharacterClass characterClass;
    private int health = 100;
    private String name;

    public Character(String name, int health, CharacterClass characterClass) {
        this.health = health;
        this.name = name;
        this.characterClass = characterClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }
}

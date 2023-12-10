package edu.wctc.Model.Classes;

import edu.wctc.Model.Interfaces.DefendStrategy;
import edu.wctc.Model.Interfaces.HeavyAttack;
import edu.wctc.Model.Interfaces.LightAttack;

public class Character {
    protected CharacterClass characterClass;
    private int health;
    private String name;

    public Character(String name) {
        health = 100;
        this.name = name;
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

    public boolean isAlive() {
        return health > 0;
    }

}

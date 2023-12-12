package edu.wctc.Model.Classes;

import edu.wctc.Model.Interfaces.DefendStrategy;
import edu.wctc.Model.Interfaces.HeavyAttack;
import edu.wctc.Model.Interfaces.LightAttack;

public class CharacterClass{

    // Fields
    public String name;
    public LightAttack lightAttack;
    public HeavyAttack heavyAttack;
    public DefendStrategy defendStrategy;


    public CharacterClass() {
    }

    // Method to preform light attack
    public int tryLightAttack() {
        return lightAttack.lightAttack();
    }

    // Method to set light attack
    public void setLightAttack(LightAttack newLightAttack) {
        lightAttack = newLightAttack;
    }

    // Method to preform heavy attack
    public int tryHeavyAttack() {
        return heavyAttack.heavyAttack();
    }

    // Method to set heavy attack
    public void setHeavyAttack(HeavyAttack newHeavyAttack) {
        heavyAttack = newHeavyAttack;
    }

    // Method to preform defend strategy
    public int tryDefendStrategy(int attack) {
        return defendStrategy.defendStrategy(attack);
    }

    // Method to set defend strategy
    public void setDefendStrategy(DefendStrategy newDefendStrategy) {
        defendStrategy = newDefendStrategy;
    }

    // Get name of CharacterClass
    public String getName(){
        return name;
    }

}

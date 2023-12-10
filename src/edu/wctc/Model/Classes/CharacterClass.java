package edu.wctc.Model.Classes;

import edu.wctc.Model.Interfaces.DefendStrategy;
import edu.wctc.Model.Interfaces.HeavyAttack;
import edu.wctc.Model.Interfaces.LightAttack;

public class CharacterClass{

    public LightAttack lightAttack;
    public HeavyAttack heavyAttack;
    public DefendStrategy defendStrategy;


    public CharacterClass() {
        super();
    }

    public int tryLightAttack() {
        return lightAttack.lightAttack();
    }

    public void setLightAttack(LightAttack newLightAttack) {
        lightAttack = newLightAttack;
    }

    public int tryHeavyAttack() {
        return heavyAttack.heavyAttack();
    }

    public void setHeavyAttack(HeavyAttack newHeavyAttack) {
        heavyAttack = newHeavyAttack;
    }

    public int tryDefendStrategy(int attack) {
        return defendStrategy.defendStrategy(attack);
    }

    public void setDefendStrategy(DefendStrategy newDefendStrategy) {
        defendStrategy = newDefendStrategy;
    }

}

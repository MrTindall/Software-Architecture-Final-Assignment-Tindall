package edu.wctc.CharacterTypes;

import edu.wctc.Model.Classes.CharacterClass;
import edu.wctc.Moves.DefendStrategy.Staffblock;
import edu.wctc.Moves.HeavyAttack.Fireball;
import edu.wctc.Moves.LightAttack.Shock;

public class Mage extends CharacterClass {

    public Mage() {
        super();
        lightAttack = new Shock();
        heavyAttack = new Fireball();
        defendStrategy = new Staffblock();
    }
}
